package hashmapconcept;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Task {							// userdefined method freqchar
		static LinkedHashMap<Character,Integer> freqChar(String st){
		LinkedHashMap<Character,Integer> a=new LinkedHashMap<>();
		for(char ch:st.toCharArray()) {
		 if(a.containsKey(ch))//contains the character
		 {
			 a.put(ch, a.get(ch)+1);//it occure before add +1
		 }
		 else {
		   a.put(ch, 1);//if it occure once onetime print
		 }
	}return a;
}
		static char maxFreq(String s) {
		LinkedHashMap<Character,Integer>op=freqChar(s);
		char c='\0';
		int max=0;
		for(Map.Entry<Character,Integer> it:op.entrySet()) {
		if(it.getValue()>max) {
			max=it.getValue();
			c=it.getKey();
			
		}                                                            
		System.out.println(c);
	}
		return c;
}
		

public static void  main(String[]args) {
	Scanner ob=new Scanner(System.in);
	String st=ob.nextLine();
	char op=maxFreq(st);
	System.out.println(op);
	
}
}