package com.jeffrey.pattern.factory.factorymethod;

/**
 * ����˵����
 *
 * @author weij
 */
public class Client {

	public static void main(String[] args) {
		AnimalCreator animalCreator=new HumanCreator();
		Animal animal=animalCreator.creatAnimal();
		animal.identity();
	}


}
