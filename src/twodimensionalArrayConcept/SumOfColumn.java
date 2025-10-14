package twodimensionalArrayConcept;

import java.util.Scanner;

public class SumOfColumn {
public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
	   int a[][]=new int[3][3];
	for(int i=0;i<a[0].length;i++) {//a[0].length
		for(int j=0;j<a.length;j++) {
			a[i][j]=b.nextInt();
			
		}
	}
	

	for(int i=0;i<3;i++) {
		int sum=0;
		for(int j=0;j<3;j++) {
			sum=sum+a[j][i];//j ,i
		}
	System.out.println(sum);
}
}

}


