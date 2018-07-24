package com.aayush.programs.numbers;
import java.util.*;
import java.lang.*;
public class HappyNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//boolean r=isHappyNumber();
	}
	static int countDigit(int n)
	{
	int count=0;
	
		if (n==0) {
			return 1;
		}
		else
		{
			while(n!=0)
			{
				n=n/10;
				count++;
				
			}
		}
		return count;
	}
	static void isHappyNymber(int n)
	{
		int sum=0;
		int count=countDigit(n);
		
		while(n!=0)
		{
			int d=n%10;
			int power=(int) Math.pow(d, count);
			sum=sum+d;
			n=n/10;
		}	
		if(sum==1)
			System.out.println("number is happy number");
	}
}