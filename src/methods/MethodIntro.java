package methods;
import java.util.Scanner;
public class MethodIntro {
	void hello() {
		Scanner s=new Scanner(System.in);
		//method definition
		int a=s.nextInt();
		int b=s.nextInt();//nextInt is predefined
		int res=a+b;
		System.out.println(res);
	}
public static void main(String[] args) {
	MethodIntro m =new MethodIntro();
	System.out.println("Meth calling 1");
	m.hello();//method calling part
	System.out.println("Meth return 1");
	
	System.out.println("Meth calling 2");//println is also a predefined
	m.hello();
	System.out.println("Meth return 2");
	
	System.out.println("Meth calling 3");
	m.hello();
	System.out.println("Meth return 3");
	
}
}
