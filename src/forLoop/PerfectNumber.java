package forLoop;
import java.util.Scanner;
class PerfectNumber {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i,sum=0,count=0;
	for(i=1;i<n;i++) {
		if(n%i==0)
		{
			count++;
			sum=sum+i;
			System.out.println(i);
			
		}
	}
	System.out.println("sum " +sum);
	if(n==sum) {
		System.out.println("perfect");
	}
	else {
		System.out.println("not perfect");
	}
}
}


