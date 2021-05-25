package areaOfCircle;

import java.util.Scanner;

class Parent{
	int radius;
}
class Child extends Parent
{
	Child(){
		radius=0;
	}
	Child(int r){
		radius=r;
	}
	public void Carea()
	{
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius " + radius + 
				" is " + area);
	}
}
public class UsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();
		Child ar= new Child(radius);
		ar.Carea();

	}

}
