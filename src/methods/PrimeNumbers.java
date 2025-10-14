package methods;

import java.util.Scanner;

public class PrimeNumbers {
	Scanner sc=new Scanner(System.in);
	boolean prime() {
			int n=sc.nextInt();
			for(int i=2;i<n/2;i++) {
				if(n%i==0)
				{
				 return false;
			 }
			}
			 return true;
			
	}
	
public static void main(String[] args) {
	
 PrimeNumbers s =new PrimeNumbers();
 System.out.println(s.prime()?"Prime":"Not Prime");
 
}

}
