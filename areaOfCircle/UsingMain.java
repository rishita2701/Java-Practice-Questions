package areaOfCircle;

import java.util.Scanner;

public class UsingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius " + radius + 
				" is " + area);
	}

}
