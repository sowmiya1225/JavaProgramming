package forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
		int n=sc.nextInt();
	
	int i,count=0;
	for(i=1;i<=n;i++) {
		if(n%i==0)
		{
			count++;
			System.out.println(i);
		}
	}
	if (count==2) {
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
	}
}
}
