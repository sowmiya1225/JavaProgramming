package stackconcept;
import java.util.Stack;
import java.util.Scanner;
public class StackIntro {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		System.out.println("Peek:"+st.peek());//print the data
		System.out.println("Pop:"+st.pop());//to display and remove
		System.out.println(st.empty());//it check empty or not
		System.out.println(st.capacity());
		//clear the element
		st.clear();
		System.out.println(st);
}
}
