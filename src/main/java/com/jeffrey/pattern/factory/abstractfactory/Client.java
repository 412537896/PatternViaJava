package com.jeffrey.pattern.factory.abstractfactory;

/**
 * ����˵����
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		SystemFactory win = new Windows();
		win.getFileSystem();
		win.getProgramLanguage();

		SystemFactory linux = new Linux();
		linux.getFileSystem();
		linux.getProgramLanguage();
	}
}
