package com.sol;

/*
 * This file consists of 
 * 1. Runtime polymorphism
 *  
 * 
 * 
 */
class Animal{

	private boolean isHerbivore;
	private boolean hasTail;
	
	
	
	public Animal() {}
	
	public Animal(boolean isHerbivore, boolean hasTail) {
		this.isHerbivore = isHerbivore;
		this.hasTail = hasTail;
	}
	
	

	public boolean isHerbivore() {
		return isHerbivore;
	}

	public void setHerbivore(boolean isHerbivore) {
		this.isHerbivore = isHerbivore;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	public void eat() {
		System.out.println("Animal is Eating...");
	}
	
	public void rush() {
		System.out.println("Animal is rushing into Garden....");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping...");
	}
}

class Dog extends Animal{
	
	private int noOfLegs;
	
	public Dog() {
		super();
	}
	
	public Dog(int noOfLegs,boolean isHerbivore, boolean hasTail) {
		super(isHerbivore,hasTail);
		this.noOfLegs = noOfLegs;
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is Eating...");
	}
	@Override
	public void rush() {
		System.out.println("Dog is rushing into Garden....");
	}
	
	
	
	
}
public class RutimePolymorphism {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		//Overriding Method
		animal1.eat();
		//Parent Method
		animal1.sleep();
		
		Animal animal2 = new Dog(4,false,true);
		System.out.println("Animal2 Has Tail..?? \n");
		System.out.println(animal2.isHasTail());
		
		
	}

	
}



