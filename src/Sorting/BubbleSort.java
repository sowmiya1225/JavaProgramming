package Sorting;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {25,66,15,45,78,93};
		System.out.println(Arrays.toString(a));
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}

}
