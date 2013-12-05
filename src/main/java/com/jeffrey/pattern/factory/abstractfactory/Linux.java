package com.jeffrey.pattern.factory.abstractfactory;

/**
 * ����˵����
 *
 * @author weij
 */
public class Linux extends SystemFactory{

	public Linux(){
		fileSystem=new Ext3();
		programLanguage=new Shell();
	}
}
