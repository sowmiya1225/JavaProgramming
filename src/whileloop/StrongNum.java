package whileloop;

public class StrongNum {
public static void main(String[] args) {
	int n=103;
	int x=n;
	int sum=0;
	while(n!=0) {
		int las=n%10;
		int fact=1;
		for(int i=0;i<=las;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(x==sum) {
	System.out.println("Strong Number"+x);
}
	else {
		System.out.println("Not strong number"+x);
	}
}

}
