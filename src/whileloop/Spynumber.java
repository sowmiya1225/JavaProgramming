package whileloop;

public class Spynumber {

	public static void main(String[] args) {
		int n=123;
		int sum=0,x=1;
		while(n!=0) {
			int last=n%10;
			sum=sum+last;
			x=sum*last;
			n=n/10;
		}
		if(x==sum) {
		System.out.println("Spy number");
		}
		else {
			System.out.println("Not Spy number");
		}
	}

}
