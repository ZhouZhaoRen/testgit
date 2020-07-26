package com.zzr.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileTest01 {
	public static void main(String[] args) throws Exception {
		File file = new File("F:\\762513\\Desktop\\test\\fileA.txt");
		File file2 = new File("F:\\762513\\Desktop\\test\\fileA2.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		// InputStreamReader isr = new InputStreamReader(fileInputStream, "UTF-8");

		File out = new File("F:\\762513\\Desktop\\22.txt");
		FileOutputStream fos = new FileOutputStream(out);
		BufferedReader br = new BufferedReader(new FileReader(file));
		PrintWriter pr = new PrintWriter(file2);
		String s = null;
		while ((s = br.readLine()) != null) {
			if (s.startsWith("444")) {
				System.out.println("找到444");
			}
			if (s.startsWith("333")) {
				pr.write(s);
				pr.flush();
			}
		}
		br.close();
		pr.close();
		fos.close();
		// osw.close();
		// isr.close();
		fileInputStream.close();
		file.delete();
		file2.renameTo(file);
	}
}
