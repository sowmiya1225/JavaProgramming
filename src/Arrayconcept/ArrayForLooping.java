package Arrayconcept;

public class ArrayForLooping {

	public static void main(String[] args) {
		int arr[]= {25,35,15,86,34};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		for(int n:arr) {
			System.out.println(n);
		}
	}
}
