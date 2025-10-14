package methods;
//Ambiguity exception 
public class Ambiguity {
void sum() {
	int a=10,b=5;
	System.out.println(a+b);
}
void sum(float a,int b) {
	System.out.println(a+b);
}
void sum(int a,float b)//parameter as same datatype it gives the output 
{
	System.out.println(a+b);
}
public static void main(String[] args) {
	Ambiguity c=new Ambiguity();
	c.sum();
	c.sum(2,1.0f);
	c.sum(2.0f,2.0f);//implicity
}
}
