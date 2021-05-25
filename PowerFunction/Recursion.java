package PowerFunction;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter base value : ");
	    int x=sc.nextInt(); 
	    System.out.println("Enter exponent value : ");
	    int y=sc.nextInt();
	    System.out.println(x+ " raised to power "+y+" is "+ power(x,y));

	}

	private static int power(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0) return 1;
		else
		return power(x,y-1)*x;
	}

}
