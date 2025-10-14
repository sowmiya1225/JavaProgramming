package forLoop;

public class Break {
	public static void main(String[]args) {
		int n=10;
		boolean e=true;
		for(int i=2;i<=n;i++)//if suppose it divide by2 so we use break
		{
			if(n%i==0) {
				e=false;
				break;
			}
		}
		if(e)
		{
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
