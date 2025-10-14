package Arrayconcept;
import java.util.Arrays;
//Arrays.toString
public class ArrayShortcut {

	public static void main(String[] args) {
		int arr[]= {3,2,1,6,5};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
