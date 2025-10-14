package twodimensionalArrayConcept;

public class DiagonalLeftToRight {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i]==a[j]) {
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}
}
