package com.zzr.io;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest01 {
	@SuppressWarnings("all")
	public static void main(String[] args) throws Exception {
		RandomAccessFile randomAccessFile = new RandomAccessFile(
				new File("F:\\762513\\Desktop\\Java和数据库\\Java从底层到精通\\6、深入理解Java泛型\\泛型.docx"), "rws");
		String s = null;
		while ((s = randomAccessFile.readLine()) != null) {
			System.out.println(s.toString());
		}
		randomAccessFile.close();
	}
}
