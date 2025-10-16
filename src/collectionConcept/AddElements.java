package collectionConcept;
import java.util.ArrayList;
public class AddElements {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(5);
	a.add(1);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(2));//index two value
	a.set(2,10);//2 index change value as 10 //method calling part parameter
	System.out.println(a);
	a.remove(3);//remove third index value
	System.out.println(a);
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	for(int i:a) {
		System.out.println(i);
	}
}

}
