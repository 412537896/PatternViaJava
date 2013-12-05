package com.jeffrey.pattern.prototype;

import java.io.IOException;

/**
 * ����˵����
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Pet pet=new Pet("Tom");
		Student stu1=new Student("A",12,pet);
		try {
			Student stu2=(Student)stu1.clone();
			System.out.println("ǳ�㿽��");
			System.out.println(stu1.getPet()==stu2.getPet());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		try {
			Student stu3=(Student)stu1.deepCopy();
			System.out.println("��㿽��");
			System.out.println(stu1.getPet()==stu3.getPet());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
