package com.jeffrey.pattern.factory.factorymethod;

/**
 * ����˵����
 *
 * @author weij
 */
public class HumanCreator implements AnimalCreator {
	@Override
	public Animal creatAnimal() {
		return new Human();
	}
}
