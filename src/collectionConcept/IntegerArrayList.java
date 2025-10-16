package collectionConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		
		
		Scanner s=new Scanner(System.in);
	
		for(int i=0;i<10;i++) {
			int b=s.nextInt();
			a.add(b);
		}
		System.out.println(a.size());
		for(int i:a) {
			System.out.println(i);
		}


}
}
