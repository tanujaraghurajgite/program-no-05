//PROGRAM NO:5 write a java program to calculate permutation and combination of two numbers
/*FORMULA::
nPr = factorial(n) / factorial(n-r)
nCr = factorial(n)/(factorial(n-r) * factorial(r))*/

import java.io.*;
import java.util.*;
class permutationANDcombination
{
	public static int fact(int num)
	{
		int fact=1,i;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
			int n,r;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n:");
			n=sc.nextInt();
			System.out.println("Enter the value of r:");
			r=sc.nextInt();
			
			System.out.print("NCR is " +(fact(n)/(fact(n-r)*fact(r))));
            System.out.print("\nNPR is " +(fact(n)/(fact(n-r))));
	}
}
			