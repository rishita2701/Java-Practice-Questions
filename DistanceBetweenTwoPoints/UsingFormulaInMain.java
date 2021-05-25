package DistanceBetweenTwoPoints;

import java.util.Scanner;
import java.lang.Math;

public class UsingFormulaInMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter point 1 : ");
	    int x1=sc.nextInt();
	    int y1=sc.nextInt();
	    System.out.println("Enter point 2 : ");
	    int x2=sc.nextInt();
	    int y2=sc.nextInt();
	    double dist= Math.sqrt((((x2-x1))*((x2-x1))) + (((y2-y1))*((y2-y1))));
	    System.out.println("Distance between two points : " + dist);

	}

}
