/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prob3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int a[]=new int[3];
			for(int j=0;j<3;j++)
			{
				a[j]=sc.nextInt();
			}
			double gg=(a[0]+a[1])/2;
			double mm=(a[1]+a[2])/2;
			double kk=(a[0]+a[2])/2;
			if(gg>=35 && kk>=35 && mm>=35)
			{
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}
	}
}
