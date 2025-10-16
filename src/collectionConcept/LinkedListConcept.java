package collectionConcept;
import java.util.LinkedList;
public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		System.out.println(a.get(0));
		a.set(0, 6);//0th index set 6
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(3));
		System.out.println(a.isEmpty());
		a.remove(1);
		a.addFirst(3);
		a.addLast(7);
		System.out.println(a);
		a.removeFirstOccurrence(2);
		System.out.println(a);
		a.removeLastOccurrence(3);//last value of duplicate
		System.out.println(a);
		System.out.println(a.indexOf(6));//6th value index 
		
		
	}

}
