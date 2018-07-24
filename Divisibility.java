package com.aayush.programs.numbers;
import java.util.*;
public class Divisibility {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String rs=isDivisible(n);
	System.out.println(rs);
}
static String isDivisible(int n)
{
	if(n%15==0)
		return "Sanju weds Gita";

else if(n%5==0)
	return "Gita";
else if(n%3==0)
		return "Sanju";
else
	return "No matches found";
}
}