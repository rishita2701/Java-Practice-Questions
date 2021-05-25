package ArmstrongNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number : ");
	    int x=sc.nextInt(); 
	    int on=x;
	    int rem=0,sum=0;
	    while(x!=0)
	    {
	    	rem=x%10;
	    	sum=sum+(rem*rem*rem);
	    	x=x/10;	    	
	    }
	    if(sum==on)
		    System.out.println(sum + " is a Armstrong Number.");
	    else
		    System.out.println(on + " is not a Armstrong Number.");

	    	

	}

}
