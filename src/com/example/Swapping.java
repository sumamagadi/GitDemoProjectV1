package com.example;

class Swapping {

	  public static void main(String[] args) {
	    int a = 11, b = 22;

	    System.out.println("Before swapping the numbers:");
	    System.out.println("First number = " + a);
	    System.out.println("Second number = " + b);

	    int temp = a; 
	    a = b; 
	    b = temp; 

	    System.out.println("After swapping the numbers: ");
	    System.out.println("First number = " + a);
	    System.out.println("Second number = " + b);
	  }
	}
