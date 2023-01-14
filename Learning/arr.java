import java.util.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String input1=sc.nextLine();
			String input2=sc.nextLine();
			//for(int j=0;j<5;j++)
			//{
				if(input1.charAt(i)==input2.charAt(i))
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
		}
	}
//}