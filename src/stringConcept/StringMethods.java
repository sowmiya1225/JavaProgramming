package stringConcept;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
	//   index 01234
		
	String s1="KALAI";
	String s3="KALAI ARASI";
	System.out.println(s1==s3);//check the memory address
	System.out.println(s1.equals(s3));//check the data kalai==kalaiarasi
	System.out.println(s1.equalsIgnoreCase(s3));//ignore the case
	System.out.println(s1.length());//length() this string 
	System.out.println(s1.compareTo(s3));//compare ASCII value
	System.out.println(s1.toLowerCase());//convert into lower case
	System.out.println(s3.trim());//reduce the space
	System.out.println(s1.indexOf("AI"));//index position 3
	System.out.println(s3.lastIndexOf("I"));//last index of value i in 10th position
	System.out.println(s3.indexOf("e",1,2));//e is not in the s3.so output -1//only pass the string we can't pass character 
	System.out.println(s3.contains("ARA"));//it contain or not return true or false.
	System.out.println(s3.contains("KALYANI"));//if string contain the value or not 
	System.out.println(s3.substring(6,11));//give index value 6 to 11.
	System.out.println(s3.endsWith("ARASI"));//it is ends with that value or not
    System.out.println(s1.repeat(2));//repeat the String how many times.
	System.out.println(s3);//Gives original String immutable
    //assign
    System.out.println(s3=s3.repeat(2));
    System.out.println(s3);//assign to s3  change the s3
	System.out.println(s1.replace("KALAI","MALAR"));//it will replace all the occurance//cannot replace the character only string
	System.out.println(s1.replaceAll("[A,E,I,O,U]", "+"));//subscript is a regular expression
	System.out.println(s1.replaceFirst("A","O"));//kalai=>it change first a only 
	System.out.println(s1.replaceAll("[A,I,E,O,U]", ""));//this for removing
	char ch[]=s3.toCharArray();
	System.out.println(Arrays.toString(ch));
	System.out.println(ch.length);//because ch is array do not use this->()
	System.out.println(s3.trim());
	System.out.println(s3.replace(" ", ""));
	
	}
}
