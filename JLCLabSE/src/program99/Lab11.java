package program99;

import java.util.Scanner;

public class Lab11 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int sum=0;
		Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int i=0; i<=n;i++)
		  if(i%2!=0)
			  sum=i+sum;
		 System.out.println("Sum of odd number is "+sum);	  
			  
	}

}
