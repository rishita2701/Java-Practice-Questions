package volumeOfPrism;

import java.util.Scanner;

public class UsingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of base:");
        double base=sc.nextDouble();
        System.out.println("Enter the height:");
        double height=sc.nextDouble();
        double  area=base*height ;
		System.out.println("Volume of prism is " + area);

	}

}
