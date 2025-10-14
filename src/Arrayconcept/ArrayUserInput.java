package Arrayconcept;

import java.util.Scanner;

public class ArrayUserInput {
public static void main(String[] args) {
	
	Scanner c=new Scanner(System.in);
	int a[]=new int[5];
	a[0]=c.nextInt();
	for(int i=0;i<a.length;i++) {
		a[i]=c.nextInt();
	}
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
	
} 
}
