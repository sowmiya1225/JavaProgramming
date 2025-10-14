package nestedloop;

public class ArmStrong {
public static void main(String[] args) {
	int n=153;
	int x=n;//copy
	int len=0;
	while(n!=0) {
		len++;
		n/=10;
	}
	x=n;
	int sum=0;
	while(n!=0) {
		int pow=1;
		int last=n%10;
		for(int i=1;i<=len;i++) {
			pow=pow*last;
		}
		sum=sum+pow;
		n/=10;
	}
	if(x==sum) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not Armstrong");
	}
}

}
