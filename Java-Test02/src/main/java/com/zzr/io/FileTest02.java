package com.zzr.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) throws IOException {
		// File src = new File("F:\\762513\\Desktop\\SSM学习文件\\简历\\我的简历\\test.txt");
		// File dist = new
		// File("F:\\\\762513\\\\Desktop\\\\SSM学习文件\\\\简历\\\\我的简历\\\\a.txt");
		String src = "F:\\762513\\Desktop\\SSM学习文件\\简历\\我的简历\\test.txt";
		String dist = "F:\\762513\\Desktop\\SSM学习文件\\简历\\我的简历\\a.txt";
		// copyFile(src, dist);
		readFileContent(src);
	}

	/**
	 * 利用字符流实现文件的逐行输出
	 */
	public static void readFileContent(String filePath) throws IOException {
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		// 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
		// 在调用 BufferedReader 的 close() 方法时会去调用 Reader 的 close() 方法
		// 因此只要一个 close() 调用即可
		bufferedReader.close();
	}

	/**
	 * 利用字节流实现文件的复制
	 */
	public static void copyFile(String src, String dist) throws IOException {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dist);
		byte[] buffer = new byte[20 * 1024];
		int cnt;
		// read() 最多读取 buffer.length 个字节
		// 返回的是实际读取的个数
		// 返回 -1 的时候表示读到 eof，即文件尾
		while ((cnt = in.read(buffer, 0, buffer.length)) != -1) {
			out.write(buffer, 0, cnt);
		}
		in.close();
		out.close();
	}
}
