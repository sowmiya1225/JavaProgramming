package stringConcept;

public class ReverseTheString {
	public static void main(String[] args) {
		String s1="SwEtHa's scOREs 100 in JAva";
		String res="";
		
		for(int i=s1.length()-1;i>=0;i=i-1) {
			char ch=s1.charAt(i);//print the first letter
			if(ch>=97&&ch<='z') {
				ch=(char)(ch-32);
			}//(S -> ASCII value)-32=s
			else if(ch>=65&& ch<='Z'){
				ch=(char)(ch+32);//o+32=O
			}
			res=res+ch;//string immutable so assign original value
		}
			
	System.out.println(res);
		
	}
}