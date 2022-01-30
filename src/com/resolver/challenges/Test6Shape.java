package com.resolver.challenges;

/**
 * 
 * @author Vaishnavi
 * 
 * Test6Shape is a base class with width and height.
 * This class is defined abstract because of getArea() method which will be implemented by child classes.
 *
 */
public abstract class Test6Shape {

	private int width;
	private int height;
	
	
	public Test6Shape(int width, int height) {
		this.width = width;
		this.height = height;	
		}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
	abstract double getArea();
	
	

}
