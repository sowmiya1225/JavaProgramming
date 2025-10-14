package twodimensionalArrayConcept;

public class DiagonalOrNot {
public static void main(String[] args) {
	int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
	boolean f=true;
	b:
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				if((r==c&&a[r][c]!=1)||(r!=c&&a[r][c]!=0)) {
					f=false;
					break b;
				}
			}
		}
	if(f) {
		System.out.println("Diagonal");
	}
	else {
		System.out.println("Not Diagonal");
	}
}

}
