package HighestCommonFactor;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
	    int x=sc.nextInt(); 
	    System.out.println("Enter another number : ");
	    int y=sc.nextInt(); 
	    System.out.println("HCF of "+x + " and "+ y+" is "+ hcf(x,y));
	}

	private static int hcf(int a, int b) {
		// TODO Auto-generated method stub
		if(a!=b)
		{
			if(a>b) 
				a=a-b;
			else 
				b=b-a;
			return hcf(a,b);
		}
		return a;
	}
}
