package com.resolver.challenges;

public class Test5 {

	public static void main(String[] args) {

		printNumbersOrText(1, 100);

	}

	/**
	 * printNumbersOrText
	 * 
	 * arg0 - start: start number for the loop (inclusive) 
	 * arg1 - end: end number for the loop (inclusive)
	 * 
	 * 
	 * This function prints all numbers from start to end except when case1 - if
	 * number is multiple of 3, prints MThree case2 - if number is multiple of 5,
	 * prints MFive case3 - if number is multiple of 3 & 5, prints Resolver
	 * 
	 */
	private static void printNumbersOrText(int start, int end) {

		for (int i = start; i <= end; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Resolver");
			} else if (i % 3 == 0) {
				System.out.println("MThree");
			} else if (i % 5 == 0) {
				System.out.println("MFive");
			} else {
				System.out.println(i);
			}
		}

	}

}
