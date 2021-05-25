package areaOfCircle;

import java.util.Scanner;

interface Circle{
	void area(int r);
}
class Area implements Circle{
	public void area (int radius)
	{
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius " + radius + 
				" is " + area);
	}
}
public class UsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ar= new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();
		ar.area(radius);
	}

}
