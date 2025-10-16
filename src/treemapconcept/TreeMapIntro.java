package treemapconcept;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapIntro {
public static void main(String[] args) {
	Map<Integer,String> n=new TreeMap<>();
	//   key  value
	n.put(0, "apple");
	n.put(1, "orange");
	n.put(2, "kiwi");
	n.put(3, "strawberry");
	n.put(4, "berries");
	System.out.println(n);
	System.out.println(n.size());
	System.out.println(n.containsValue("blueberry"));
	System.out.println(n.containsKey(4));
	System.out.println(n.entrySet());
	for(Map.Entry<Integer,String> i:n.entrySet()) {
		System.out.println(i.getKey()+":"+i.getValue());
	}
}

}
