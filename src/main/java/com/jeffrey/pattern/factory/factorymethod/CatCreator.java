package com.jeffrey.pattern.factory.factorymethod;

/**
 * ����˵����
 *
 * @author weij
 */
public class CatCreator implements AnimalCreator {
	@Override
	public Animal creatAnimal() {
		return new Cat();
	}
}
