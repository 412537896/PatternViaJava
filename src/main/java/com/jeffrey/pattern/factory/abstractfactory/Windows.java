package com.jeffrey.pattern.factory.abstractfactory;

/**
 * ����˵����
 *
 * @author weij
 */
public class Windows extends SystemFactory  {


	public Windows(){
		fileSystem=new NTFS();
		programLanguage=new Cmd();
	}
}
