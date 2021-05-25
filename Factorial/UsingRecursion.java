package Factorial;

import java.util.Scanner;

public class UsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial of "+ n + " is " + fact(n));


	}
static int fact(int n)
{
	if(n==1 || n==0)
		return 1;
	else
		return n* fact(n-1);
}
}
