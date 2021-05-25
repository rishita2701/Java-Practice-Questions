//AVERAGE OF 1,2,3.....N

package AverageOf_N_Numbers;

import java.util.Scanner;

public class UsingMain_Method1 {
	public static void main(String[] args) {
		double sum=0,res=0;	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter N : ");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    	sum+=i;
	    res=sum/n;
        System.out.println("Average : "+res);
	    
	}	
    

}
