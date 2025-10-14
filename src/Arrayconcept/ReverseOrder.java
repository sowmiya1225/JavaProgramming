package Arrayconcept;

public class ReverseOrder {
//a.length=6. a.length-1=5=>it is point the index value
	public static void main(String[] args) {
		//        0 1 2 3 4 5
		int a[]= {1,2,3,4,5,6};
		for(int i=a.length-1;i>=0;i=i-1) {
			System.out.println(a[i]);
		}
	}

}
/*(int i=5 //this is index value ;i>=0;i=i-1 //statement 3)
 5>=0 condition true so print the array value and move to statement 3
  */