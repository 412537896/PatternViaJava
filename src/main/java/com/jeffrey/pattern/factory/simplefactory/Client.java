package com.jeffrey.pattern.factory.simplefactory;

/**
 * ����˵����
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		YSeries y=LenovoFactory.getYSeries("com.jeffrey.pattern.factory.simplefactory.Y410");
		y.descripe();
	}
}
