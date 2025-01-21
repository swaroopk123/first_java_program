package com.basic;

import java.util.Scanner;

public class table {
public static void main(String[] args) {
	System.out.println("enter your choice table number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	//int j=12;
	int coun=0;
	for(int i=1;i<=14;i++) {
		
		int l=i*n;
		System.out.println(l);
		//System.out.println(i*n);
		
		//coun=i*n;
	}
	//System.out.println(coun);

}
}
