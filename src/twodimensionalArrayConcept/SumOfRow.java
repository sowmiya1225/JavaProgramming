package twodimensionalArrayConcept;

import java.util.Scanner;

public class SumOfRow {
public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
    int a[][]=new int[3][3];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=b.nextInt();
			
		}
	}
	
	
	for(int i=0;i<3;i++) {
		int sum=0;
		for(int j=0;j<3;j++) {
			sum=sum+a[i][j];
		}
	System.out.println(sum);
}
}

}
