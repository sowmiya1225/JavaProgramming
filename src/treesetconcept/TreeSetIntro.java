package treesetconcept;

	import java.util.TreeSet;
	import java.util.Set;
	public class TreeSetIntro{
	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		s.add("h");
		s.add("e");
		s.add("l");
		s.add("l");
		s.add("o");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains("h"));
		System.out.println(s.remove("l"));
		System.out.println(s);
		System.out.println(s.removeAll(s));
		System.out.println(s);
		
	}
	}
	

