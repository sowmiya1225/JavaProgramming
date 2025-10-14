package basic;
import java.util.Scanner;
public class UserInput {
 public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	int n=sc.nextInt();
	System.out.println("Value "+n);
	char ch=sc.next().charAt(0);
	System.out.println("char "+ch);
	byte b=sc.nextByte();
	System.out.println("Byte "+b);
	float f=sc.nextFloat();
	System.out.println("Float "+f);
	String s=sc.nextLine();//it takes enter.so we use before object name and property sc.nextLine();
	System.out.println("String "+s);
	}
	}

