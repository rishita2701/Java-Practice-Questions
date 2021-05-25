package HighestCommonFactor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
	    int x=sc.nextInt(); 
	    System.out.println("Enter another number : ");
	    int y=sc.nextInt(); 
	    System.out.println("HCF of "+x + " and "+ y+" is "+ hcf(x,y));
	}

	private static int hcf(int x, int y) {
		// TODO Auto-generated method stub
		int t;
		while(y>0) {
			t=y;
			y=x%y;
			x=t;
		}
		return x;
	}

}
