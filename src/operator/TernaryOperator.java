package operator;
import java.util.Scanner;
public class TernaryOperator {
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the marks");
	int n=s.nextInt();
	String res=n>49?"Pass":"Fail";
    System.out.println(res);
	
	}
}
