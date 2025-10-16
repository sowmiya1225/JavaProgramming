package collectionConcept;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class StringArrayList {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String b=s.nextLine();
			a.add(b);
		}
		System.out.println(a);
		a.add("lotus");
		a.set(0, "hello");//0th index change value
		System.out.println(a);
		Collections.sort(a);//sort the elements
		System.out.println(a);
		System.out.println(a.contains("lilly"));//specific element is there or not
		System.out.println(a.isEmpty());//check empty or not
		if(a.isEmpty()) {
			a.add("flowers");
			System.out.println(a);
		}
		else {
			System.out.println("list is not empty");
		}
		a.clear();
		System.out.println("after clear:"+a);
		
}

}
