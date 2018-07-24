package com.aayush.programs.numbers;
import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=sumOfDigits(n);
	System.out.println("sum is"+sum);
	
}

private static int sumOfDigits(int n) {
	int sum=0;
	while(n!=0)
	{
		int d=n%10;
		sum=sum+d;
		n=n/10;
		
	}
	return sum;
}
}
