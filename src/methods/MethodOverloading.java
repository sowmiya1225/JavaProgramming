package methods;


public class MethodOverloading {
void sum(int num1,int num2) {
	System.out.println(num1+num2);
}
void sum(int num1,int num2,int num3)//give parameter change or datatype
{
	System.out.println(num1+num2+num3);
}
public static void main(String[]args) {
	MethodOverloading s=new MethodOverloading();
	s.sum(4,2);
	s.sum(2,3,4);
}
}
