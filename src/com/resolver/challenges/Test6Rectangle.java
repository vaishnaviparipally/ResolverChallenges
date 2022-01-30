package com.resolver.challenges;

/**
 * 
 * @author Vaishnavi
 * Test6Rectangle is the Subclass extending Test6Shape
 * This class returns Area of Rectangle
 *
 */
public class Test6Rectangle extends Test6Shape {

	public Test6Rectangle(int width, int height) {
		super(width, height);
		
	}

	@Override
	double getArea() {
		
		return super.getHeight()*super.getWidth();
	}

}
