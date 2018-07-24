package com.aayush.programs.numbers;
import java.util.*;
public class Power {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("Enter power");
	int p = sc.nextInt();
	int r= power(n,p);
	System.out.println(r);
}

 static int power(int n, int p) {
	 int pow=1;
	for(int i=p;i>0;i--)
	{
		 pow=n*pow;
	}
	return pow;
}
}
