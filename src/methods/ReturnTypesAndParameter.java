package methods;

import java.util.Scanner;
public class ReturnTypesAndParameter {
	Scanner sc=new Scanner(System.in);

	//method declaration or definition part

	//without return type without Parameter

	void add() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
	}
 //with return type without Parameter
	float mul() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		return a*b;
}
//without return type with Parameter
	void sub(int a,int b) {
		if(a<b) {
			System.out.println("input 1 is smaller that input 2");
			return;//it will go where it is called 
		}
		System.out.println(a-b);
	}
//with return type with Parameter
	String concatination(String s1,String s2,String s3) {
		return s1+" "+s2+" "+s3;//return to                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          call part
}
public static void main(String[] args) {
		ReturnTypesAndParameter ob1=new ReturnTypesAndParameter();
		ob1.add();  //method calling part
		float res=ob1.mul();
		System.out.println(res);  //method calling part
		int a=10;
		ob1.sub(a,20);  //method calling part
		ob1.sub(20,a);  //method calling part 
		System.out.println(ob1.concatination("Velalar","Engineering","College"));
	}
}
