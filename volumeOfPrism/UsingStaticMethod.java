package volumeOfPrism;

import java.util.Scanner;

public class UsingStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);        
        System.out.println("Enter the area of base:");
        double base=s.nextDouble();
        System.out.println("Enter the height:");
        double height=s.nextDouble();
        double  a= Vol.vol(base,height); 
        System.out.println("Volume Of Prism is:" +a);
	}

}
class Vol{
	static double vol (double base,double height) {
		double  a=base*height ;		 
        return a;
	}
}