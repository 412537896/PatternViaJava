package com.jeffrey.pattern.factory.abstractfactory;

/**
 * ����˵����
 *
 * @author weij
 */
public abstract class FileSystem {
	public String getFileSystemName(){
		return this.getClass().toString();
	}

}
