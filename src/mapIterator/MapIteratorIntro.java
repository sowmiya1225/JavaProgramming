package mapIterator;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class MapIteratorIntro {
public static void main(String[]args) {
	LinkedHashMap<Character,Integer> n=new LinkedHashMap<>();
	n.put('a', 0);
	n.put('b', 0);
	n.put('c', 0);
	n.put('d', 0);
	n.put('e', 0);
	Iterator<Character> it=n.keySet().iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
