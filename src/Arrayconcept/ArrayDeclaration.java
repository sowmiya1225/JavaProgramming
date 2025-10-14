package Arrayconcept;

public class ArrayDeclaration {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		//i<=arr.length-1
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
