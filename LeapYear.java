package com.aayush.programs.numbers;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LeapYear ly=new LeapYear();
		boolean rs= ly.isLeapYear(n);
		if(rs)
			System.out.println("year is a leap year");
		else
			System.out.println("year is not a leap Year");
}
	public boolean isLeapYear(int n)
	{
		return(n%400==0||n%4==0&&n%100!=0);
	
	}
	
}
