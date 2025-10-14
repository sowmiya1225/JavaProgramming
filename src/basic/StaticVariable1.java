package basic;

public class StaticVariable1 {

	String name;
	static String clg;
	void disp() {
		System.out.println(name+" "+clg);
	
	}
	public static void main(String[] args) {
		StaticVariable1 n1=new StaticVariable1();
		StaticVariable1 n2=new StaticVariable1();
		n1.name="Lilly";
		clg ="Vcet";
		n2.name="Rose";
		n1.disp();
		n2.disp();
		
	}

}
