//AVERAGE OF RANDOM N NUMBERS

package AverageOf_N_Numbers;

import java.util.Scanner;

public class UsingMain_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,res=0;	
		int a[]=new int[20];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter count : ");
	    int n=sc.nextInt();
	    System.out.println("Enter the numbers : \n");
	    for(int i=0;i<n;i++)
    	{
	    	a[i]=sc.nextInt();
	    	sum+=a[i];
    	}
	    res=sum/n;
        System.out.println("Average : "+res);

	}

}
