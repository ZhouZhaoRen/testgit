package com.io.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.CharsetUtil;

public class HelloNetty {
	public static void main(String[] args) {
		new NettyServer(8888).serverStart();
	}
}

class NettyServer {

	int port = 8888;

	public NettyServer(int port) {
		this.port = port;
	}

	public void serverStart() {

		EventLoopGroup bossGroup = new NioEventLoopGroup(); // 主线程组，用于接受客户端的连接，但是不做任何处理

		EventLoopGroup workerGroup = new NioEventLoopGroup();// 从线程组, 老板线程组会把任务丢给他，让手下线程组去做任务
		ServerBootstrap b = new ServerBootstrap();

		b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
				.childHandler(new ChannelInitializer<SocketChannel>() { // 子处理器，用于处理workGroup
					@Override
					protected void initChannel(SocketChannel ch) throws Exception {
						ch.pipeline().addLast(new Handler());
					}
				});

		try {

			ChannelFuture f = b.bind(port).sync();// 启动server，并且设置8088为启动的端口号，同时启动方式为同步

			f.channel().closeFuture().sync();// 监听关闭的channel，设置为同步方式
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			workerGroup.shutdownGracefully();// 退出线程组
			bossGroup.shutdownGracefully();// 退出线程组
		}

	}
}

class Handler extends ChannelInboundHandlerAdapter {
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		// super.channelRead(ctx, msg);
		System.out.println("server: channel read");
		ByteBuf buf = (ByteBuf) msg;

		System.out.println(buf.toString(CharsetUtil.UTF_8));
		String s = "您好仁哥";
		ChannelFuture writeAndFlush = ctx.writeAndFlush(Unpooled.copiedBuffer(s.getBytes()));
		writeAndFlush.addListener(new ChannelFutureListener() {

			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				System.out.println("消息已发出");
				ctx.close();
			}

		});

		// buf.release();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		// super.exceptionCaught(ctx, cause);
		cause.printStackTrace();
		ctx.close();
	}
}
