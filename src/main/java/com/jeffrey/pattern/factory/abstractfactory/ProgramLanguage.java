package com.jeffrey.pattern.factory.abstractfactory;

/**
 * ����˵����
 *
 * @author weij
 */
public abstract class ProgramLanguage {
	public String getProgramLanguage(){
		return this.getClass().toString();
	}
}
