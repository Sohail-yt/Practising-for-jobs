/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int count = 0;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>=10)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
