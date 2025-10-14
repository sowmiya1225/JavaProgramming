package methods;

public class EvenOrOdd {
boolean even(int n) {
	if(n%2==0) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		EvenOrOdd s=new EvenOrOdd();
		System.out.println(s.even(2)?"Even":"Odd");
	}

}
