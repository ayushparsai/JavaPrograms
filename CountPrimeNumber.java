package com.aayush.programs.numbers;
import java.util.Scanner;
public class CountPrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter range");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=countPrime(n);
	System.out.println(r);
}

static int countPrime(int n)
	{
	int count=0;
	for (int i =1; i<=n; i++) 
	{
		boolean r=isPrime(i);
		if(r)
			count++;
	}
	return count;
	}
	
static boolean isPrime(int n)
{
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
	return false;
	}
	return true;
}
}