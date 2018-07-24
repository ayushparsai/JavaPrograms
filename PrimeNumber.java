package com.aayush.programs.numbers;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean r=isPrime(n);
	if(r)
	System.out.println("number is prime");
	else
		System.out.println("number is not prime");
}

private static boolean isPrime(int n) {
	for(int i=2;i<=n/2;i++)	
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
