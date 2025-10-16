package collectionConcept;
import java.util.ArrayList;
import java.util.List;
public class ArrayListProgram {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	List l=new ArrayList();//interface
	int n=10;//primitive
	Integer nu=n;//non primitive
	String s=String.valueOf(n);
	System.out.println(Integer.valueOf(n));
	char c='a';
	System.out.println(Character.isAlphabetic(c));
	System.out.println(nu.MAX_VALUE);
	
	int num=1234;
	//Reversing 
	String st=String.valueOf(num);
	StringBuffer t=new StringBuffer();
	t.append(st);
	System.out.println(t.reverse());
	//AutoBoxing => primitive to Objects
	
	Integer u= Integer.valueOf(num);
	float f=20.25f;
	Float f1=Float.valueOf(f);
	System.out.println(f1);
	//UnBoxing
	Integer no=2564;
	int op=no.intValue();
	int o=no;
	System.out.println(o);
	//non primitive to non primitive
	//Integer to String
	Integer no1=5678;
	String st1=String.valueOf(no1);
	System.out.println(st1);
	//String to Integer
	String s2="56698";
	Integer res=Integer.parseInt(s2);
	System.out.println(s2);
}
	

}
