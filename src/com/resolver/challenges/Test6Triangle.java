package com.resolver.challenges;

/**
 * 
 * @author Vaishnavi
 * Test6Traingle is the Subclass extending Test6Shape
 * This class returns Area of Traingle
 *
 */

public class Test6Triangle extends Test6Shape {

	public Test6Triangle(int width, int height) {
		super(width, height);
		
	}
	
	@Override
	public double getArea() {
		
		return super.getWidth()* super.getHeight()*0.5;
		
	}

}
