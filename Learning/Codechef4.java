/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		for(int j=0;j<2;j++)
		{
			a[j]=sc.nextInt();
		}
		int p=(a[0]);
		int q=(a[0]);
		if(p>q){
			System.out.println(p);
		}
		else
		{
			System.out.println(q);
		}
		}
}

