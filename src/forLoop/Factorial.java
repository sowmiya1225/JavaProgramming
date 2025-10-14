package forLoop;

import java.util.Scanner;

public class Factorial {

		 static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
		int s=sc.nextInt();
		int i,n=1,sum=0;
		for(i=1;i<=s;i++) {
			n=n*i;
			sum=sum+i;
		}
		System.out.println(n);
		System.out.println(sum);
		}
	}


