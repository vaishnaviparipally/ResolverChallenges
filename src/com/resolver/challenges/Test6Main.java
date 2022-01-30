package com.resolver.challenges;

/**
 * 
 * @author Vaishnavi
 * This is the main class which instantiates Triangle and Rectangle and corresponding Area value is printed.
 *
 */

public class Test6Main {

	public static void main(String[] args) {
		
		Test6Shape triangle = new Test6Triangle(10, 5);
		
		Test6Shape rectangle = new Test6Rectangle(20, 30);
		
		System.out.println("Area of triangle: "+ triangle.getArea());
		
		System.out.println("Area of Rectangle: "+ rectangle.getArea());
				
	}

}
