package basic;

import java.util.Scanner;

//type casting
public class ASCII
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the input");
		char ch=sc.next().charAt(0);

		int val=(int)'0';
		int op=ch;
		System.out.println(val);
		System.out.println(op);
		System.out.println((char)(op+32));//converting capital to small
		System.out.println((char)(op-32));//converting capital to small

	}

}
