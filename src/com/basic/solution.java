package com.basic;

import java.util.Scanner;

public class solution {
	
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int  j=sc.nextInt();
		int  count=0;
		
		for(int i=0;i<13;i++) {
			
			System.out.println(i*j);

			count+=i*j;
		}
		System.out.println(count);
	}
	

}
