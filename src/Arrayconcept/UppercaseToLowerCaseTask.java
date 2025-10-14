package Arrayconcept;

public class UppercaseToLowerCaseTask {
public static void main(String[] args) {
	String s1="SowMI's scOREs 100 in JAva";
	String res="";
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);//print the first letter
		if(ch>=97&&ch<='z') {
			ch=(char)(ch-32);
		}//S-32=s
		else if(ch>=65&& ch<='Z'){
			ch=(char)(ch+32);//o+32=O
		}
		res=res+ch;
	}
		System.out.println(res);
	
}

}
