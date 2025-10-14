package mutableString;

public class StringBufferConcept {

	public static void main(String[] args) {
		String a="Nisha";
		StringBuilder b=new StringBuilder();
		System.out.println(b.capacity());
		System.out.println(b.length());
		b.append(a);//add value in the same address 
		//if we add assign the value it will create new address so we use buffer
	    a=a+b;//a has nisha b also nisha
	    System.out.println(a);
	    //
		System.out.println(b);
		System.out.println(b.capacity());
		System.out.println(b.length());
		b.append(" is a good girl");
		System.out.println(b);
		System.out.println(b.capacity());
		System.out.println(b.length());
	/*	b.reverse();
		System.out.println(b);
	*/
		b.delete(11, 16);
		System.out.println(b);//delete  
		b.replace(11, 14, " was");
		System.out.println(b);
		b.insert(16, " has");
		System.out.println(b);
	}

}
