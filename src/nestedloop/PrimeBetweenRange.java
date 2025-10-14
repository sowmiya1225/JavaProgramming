package nestedloop;

public class PrimeBetweenRange {

	public static void main(String[] args) {
	
		
		for(int n=10;n<=20;n++) {
			int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				{
				count++;//if it is true increment
				}
			}
		if(count==2) {
			//factor count is 2,prime number. example.11->1,11 so 2 
			System.out.println(n);
		}
		
		}
		
	}
}
