package com.del;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int c= scan.nextInt();
		if(c<3)
		{
			System.out.println("Please enter atleast 3 numbers.");
		}
		int array[]=new int[c];
		for(int j=0;j<c;j++) {
			array[j]= scan.nextInt();
			}
		System.out.println(UserMainCode.checkTripplets(array));
	}

}
