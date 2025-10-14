package Arrayconcept;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int a[]=new int[6];
		a[0]=c.nextInt();
		for(int i=1;i<a.length;i++) {
			a[i]=c.nextInt();
		}
		int sum=0;float avg=0;
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    	 sum=sum+a[i];
	    	 avg=sum/a.length;
	    }
	    System.out.println("Total: "+sum);
		System.out.println("Average: "+avg);
	}
}
