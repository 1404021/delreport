package com.del;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		int choice=0;
		System.out.println("Enter your choice 1.add 2.sub 3.mul 4.div: ");
		Scanner sc= new Scanner(System.in);
		choice= sc.nextInt();
		Arithmetic[] arr= {new Add(),new Subtract(),new Multiply(), new Divide()};
		
		
		

	}

}
