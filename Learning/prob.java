/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Mains
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
    		int n=sc.nextInt();
    		int []arr=new int[n];
		for(int j=0;j<n;j++)
		{
		    arr[j]=sc.nextInt();
		}
		String V=sc.next();
		for(int k=0;k<V.length();k++)
		{
		    if(V.charAt(k)=='1')
            {
                arr[k]=999;
            }
		}
        // int min=arr[0];
        Arrays.sort(arr);
        if(arr[0]==999)
        System.out.println(0);
        else
        {
            System.out.println(arr[0]);
        }
		}
	}
}
