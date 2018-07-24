package com.aayush.programs.numbers;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			num=1;
				
	}
	if(num==0)
		System.out.println(n);
	else
		System.out.println("number is not prime");
	
}
}
