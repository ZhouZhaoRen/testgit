package com.zzr.newInstance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class InstanceTest {
	public static void main(String[] args) throws Exception {
		// 通过new关键字创建对象
		Student s1 = new Student(18);

		// 使用Class类的newInstance方法(反射机制)
		Student s2 = (Student) Class.forName("com.zzr.newInstance.Student").newInstance();

		// 使用Constructor类的newInstance方法(反射机制)
		Constructor<Student> constructor = Student.class.getConstructor(Integer.class);
		Student s3 = constructor.newInstance(18);

		// 使用Clone方法创建对象
		Constructor<Student> constructor2 = Student.class.getConstructor(Integer.class);
		Student s31 = constructor2.newInstance(18);
		Student s4 = (Student) s31.clone();

		// 使用(反)序列化机制创建对象
		Constructor<Student> constructor3 = Student.class.getConstructor(Integer.class);
		Student s32 = constructor.newInstance(18);
		// 写对象
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.bin"));
		objectOutputStream.writeObject(s32);
		objectOutputStream.close();
		// 读对象
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.bin"));
		Student s5 = (Student) objectInputStream.readObject();
		objectInputStream.close();
	}
}
