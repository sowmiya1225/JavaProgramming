package operator;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value1:");
		int n=s.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the value2:");
		int n2=s2.nextInt();
		System.out.println(n+n2);
	}

}
