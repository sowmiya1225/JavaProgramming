package basic;
//default math class so we don't import
public class Mathematics {
	public static void main(String[]args)
	{
		System.out.println(Math.pow(2, 7));
		System.out.println(Math.ceil(2.6));
		System.out.println(Math.floor(2.8));
		System.out.println(Math.round(2.4));
		System.out.println(Math.sqrt(100));
		System.out.println(Math.abs(-27));
		System.out.println(Math.min(2,5 ));
		System.out.println(Math.max(2, 7));
		System.out.println(7/2);
		System.out.println(7%3);
		System.out.println((float)7/2);
	    float n=7.0f/2;
		System.out.println(n);
	    System.out.println(29837/10);
	    int a=25;
	    int quo=a/10;
	    int rem=a%10;
	    int res=rem*10;
	    System.out.println(rem+""+quo);//concatenation in string
	    System.out.println(res+quo);
	    System.out.println(rem*10+quo);
	}
	

}
