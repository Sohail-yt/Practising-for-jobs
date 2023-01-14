/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prob4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a[]=new int[100];
			for(int j=0;j<2;j++)
			{
				a[j]=sc.nextInt();
			}
			int p=(a[0])*(a[1]);
			System.out.println(p);
		}
	}
}
