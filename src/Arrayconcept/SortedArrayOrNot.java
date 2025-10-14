package Arrayconcept;

public class SortedArrayOrNot {
public static void main(String[] args) {
	int a[]= {32,34,36,38,40};
	for(int i=0;i<a.length-1;i++) {
	
		if(a[i]>a[i+1]) {
			System.out.println("Unsorted");
			return;//whole program terminate after the return
		}
	}
		System.out.println("Sorted");
	
	}
	
	
}


