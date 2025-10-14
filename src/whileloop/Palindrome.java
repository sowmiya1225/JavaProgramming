package whileloop;

public class Palindrome {
	public static void main(String[] args) {
		int n=121;
		int a=n;
		int sum=0;
		while(n!=0) {
			int las=n%10;
			sum=(sum*10)+las;
			n=n/10;
			
		}
		System.out.println(sum);
	
	if(a==sum) {
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	}
}
