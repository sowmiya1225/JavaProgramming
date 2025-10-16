package methods;

class WordReverse {
	String revWord(String s) {

		String res="";

		for(int i=s.length()-1;i>=0;i--) {

			res=res+s.charAt(i);

		}

		return res;

	}

	String rev(String st) {

		String arr[]=st.split(" ");

		String ret="";

		for(String s:arr) {

			ret=ret+revWord(s)+" ";

		}

		return ret.trim();

	}

	public static void main(String[] args) {

		String st="velalar engineering college";

		WordReverse s=new WordReverse();

		String res=s.rev(st);

		System.out.println(res);

	}

}
