package com.jeffrey.pattern.builder;

/**
 * ����˵����
 *
 * @author weij
 */
public class Set2 implements KFC {
	private Food food=new Food();
	@Override
	public void makeFood() {
		food.add("ȫ��Ͱ");
	}

	@Override
	public void showFood() {
		food.showFood();
	}
}
