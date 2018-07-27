package com.del;

import java.lang.reflect.Array;

public class UserMainCode {

		public static boolean checkTripplets(int arr[]) {
			int check=0;
			boolean ch= false;
			for(int i=0;i<arr.length-2;i++) {
				if(arr[i]==arr[i+1]&& arr[i]==arr[i+2])
					check++;
			}
			if(check>0)
				ch=true;
			else
				ch=false;
			return  ch;
		}

		public static void main(String[] args) {
			

		}

}
