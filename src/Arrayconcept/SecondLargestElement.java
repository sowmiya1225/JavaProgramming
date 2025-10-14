package Arrayconcept;

public class SecondLargestElement {
	public static void main(String[] args) {
		int a[]= {10,11,19,8,12,1};
		int max=a[0];
		int s=a[0];
     for(int i=0;i<a.length;i++) {
    	 if(a[i]>max) {
				s=max;//s=10
				max=a[i];//max=12
			}	// 10<11  11!=12 //true 
    	 		//10<12      12!=12
			else if(s<a[i]&& a[i]!=max)
			{
				s=a[i];
			}
		}
     System.out.println("max:"+max);
		System.out.println("Second Largest:"+s);
	}
}
