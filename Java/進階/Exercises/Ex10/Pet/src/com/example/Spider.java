package com.example;

public class Spider extends Animal {
	
	public Spider() {
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("蜘蛛吃蚊子");
	}

}
