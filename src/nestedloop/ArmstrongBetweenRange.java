package nestedloop;

public class ArmstrongBetweenRange {

		public static void main(String[] args) {
			for(int n=1;n<=155;n++) {
			int x=n;//copy
			int len=0;
			while(n!=0) {
				len++;
				n/=10;
			}
			
			n=x;
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
		
			if(sum==x) {
				System.out.println(x);
			}
			n=x;
			}
		}
	}

