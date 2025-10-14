package twodimensionalArrayConcept;

public class MatrixAddition {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int c[][]=new int[3][3];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			}
	}
 for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[0].length;j++) {
       }
	}
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c[0].length;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			}
		System.out.println("    ");
		}
	}
}
/*
 * 
System.out.println(a[i][j]+b[i][j]+" "); for direct addition.*/
