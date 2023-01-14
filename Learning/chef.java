/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a[]=new int[n];
            for(int j=0;j<a.length;j++)
            {
                a[j]=sc.nextInt();
            }
            int sum=0;
            for(int k : a)
            {
                sum+=k;
            }
            if(sum >= 1 && sum <= 2)
            {
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
	}
}
