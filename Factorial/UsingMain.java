package Factorial;

import java.util.Scanner;

public class UsingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial of "+ n + " is " + fac);

	}

}
