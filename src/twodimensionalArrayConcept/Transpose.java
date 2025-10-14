package twodimensionalArrayConcept;

public class Transpose {
	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			 }
			System.out.println();
			
		}
	}
	
}
