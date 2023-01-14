import java.util.*;
class Codechefh
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ll=sc.nextInt();
		ArrayList<Integer> array1=new ArrayList<Integer>();
		ArrayList<Integer> array2=new ArrayList<Integer>();
		for(int j=0;j<n;j++)
		{
    		for(int i=0;i<ll;i++)
    		{
    			array1.add(sc.nextInt());
    			if(array1.get(i)>=1000)
    			{
    				array2.add(array1.get(i));
    			}
    		}
		}
    	System.out.println(array2.size());
	}
}
