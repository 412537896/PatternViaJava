package com.jeffrey.pattern.builder;

/**
 * ����˵����
 *
 * @author weij
 */
public class Set1 implements KFC {
	private Food food=new Food();
	@Override
	public void makeFood() {
		food.add("�¶��������ȱ�");
	}

	@Override
	public void showFood() {
		food.showFood();
	}
}
