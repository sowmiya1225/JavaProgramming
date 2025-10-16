package collectionConcept;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		int b=s.nextInt();
		a.add(b);
	}
	System.out.println(a);
	System.out.println(a.size());
	if(a.isEmpty()) {
		for(int j=0;j<4;j++)
		{
			int c=s.nextInt();
			a.add(c);
		}
	System.out.println(a);
	}
	else if(a.size()%2==0) {
		int d=a.size()*2;
		for(int k=a.size();k<d;k++) {
			int e=s.nextInt();
			a.add(e);
		}
		System.out.println(a);
		System.out.println(a.size());
	}
	else {
	System.out.println(a);
	}
  }
}
