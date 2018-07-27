package com.del;

import java.util.Scanner;

public abstract class Arithmetic {
	 int num1,num2, num3;
	 Scanner scan = new Scanner(System.in);
	 
	
	public Arithmetic(int num1, int num2, int num3) {
		this.num1= num1;
		this.num2= num2;
		this.num3= 0;
	}
		


	abstract void calculate();
		
		

	public void read() {
		System.out.println("Enter the first number: ");
		System.out.println("Enter the second number: ");
		num1= scan.nextInt();
		num2= scan.nextInt();
		
	}


	public void disp() {
		System.out.println("The answer is: "+num3);
		
	}
	

}
