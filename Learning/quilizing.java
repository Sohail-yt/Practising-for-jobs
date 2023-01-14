/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class quilizing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a[]=new int[2];
            for(int j=0;j<2;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int k=0;k<10;k++)
            {
                if(k+a[0]==(-k-a[1]))
                {
                    System.out.println("Yes");
                }
                else if(a[0]==a[1])
                {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
	}
}
