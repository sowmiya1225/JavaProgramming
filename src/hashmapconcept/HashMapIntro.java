package hashmapconcept;
import java.util.HashMap;
import java.util.Map;
public class HashMapIntro {
public static void main(String[] args) {
	Map<Integer,String> n=new HashMap<>();
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
}
}
