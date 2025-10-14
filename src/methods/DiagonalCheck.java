package methods;

public class DiagonalCheck {
	boolean diagonal(int arr[][]) {
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if((r==c&&arr[r][c]!=1)||(r!=c)&&(arr[r][c]!=0)) {
					return false;
				}
			}
		}
		return true;
	}

public static void main(String[] args) {
	int num1[][]= {{0,0,1},{0,1,0},{1,0,0}};
	int num2[][]= {{1,0,0},{0,1,0},{0,0,1}};
	DiagonalCheck s=new DiagonalCheck();
	System.out.println(s.diagonal(num1)?"Diagonal Matrix":"Not Diagonal");
	System.out.println(s.diagonal(num2)?"Diagonal Matrix":"Not Diagonal");
	}
}
