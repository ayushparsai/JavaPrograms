package com.aayush.programs.numbers;
import java.util.*;
import java.lang.*;

public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean r=isArmstrong(n);
	if(r)
		System.out.println("number is armstrong");
	else
		System.out.println("number is not armstrong");
}
  static boolean isArmstrong(int n) {
	  int x=n;
	  int c=countDigit(n);
	  int sum=0;
	  while(n!=0)
	  {
		int d=n%10;
	double num=Math.pow(d, c);
	sum=(int) (sum+num);
	n=n/10;	
	  }
	return sum==x;

	
}
static int countDigit(int n)
   {
	 if(n==0)
	  return 1;
	 else
	 {
	   int	count=0;
	   while(n!=0)
	   {
		 n=n/10;
		 count++;
		  
	   }
	   
	   return count;
   }}
   
}
