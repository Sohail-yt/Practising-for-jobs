// package gg;
/*
 * non static method calling;
 */

public class koksk {
	public void jamun()
	{
		System.out.println("i am jamun");
	}
	
	public void raju()
	{
		System.out.println("i am raju");
	}

	public static void main(String[] args) {
		System.out.println("i am MAin");
		koksk jamun=new koksk();
		jamun.jamun();//class name and object naem should be same
		jamun.raju();
//		raju();
		

	}

}
