package com.jeffrey.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ����˵����
 *
 * @author weij
 */
public class Student implements Serializable, Cloneable {
	private static final long serialVersionUID = -4160976962521976156L;
	private String name;
	private int age;
	private Pet pet;

	public Student(String name, int age, Pet pet) {
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��㿽��
	 *
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepCopy() throws IOException, ClassNotFoundException {
		//�ֽ�������������ݴ浽�ڴ���
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//���л�
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		//�����л�
		return ois.readObject();
	}

	/**
	 * ǳ�㿽��
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		//��¡Employee�����ֶ��Ľ�һ����¡Employee�����а�����Employer����
		Student student = (Student) super.clone();
		student.setAge(this.age);
		student.setName(this.name);
		return student;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
