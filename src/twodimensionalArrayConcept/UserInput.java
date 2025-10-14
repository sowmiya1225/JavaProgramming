package twodimensionalArrayConcept;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
	    int b[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				b[i][j]=a.nextInt();
				
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.print(b[i][j]+" ");
		}
			
			System.out.println();
		}
	}
	}
