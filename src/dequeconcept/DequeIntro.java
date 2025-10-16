package dequeconcept;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class DequeIntro {
public static void main(String[] args) {
	Deque<Integer> a=new ArrayDeque<>(); 
	Deque<Integer> d=new LinkedList<>();
	a.offer(1);
	a.offer(2);
	a.offer(3);
	a.offer(4);
	a.offer(5);
	System.out.println(a);
	d.offer(10);
	d.offer(20);
	d.offer(30);
	d.offer(40);
	d.offerFirst(50);//add in the first
	d.offerLast(60);//add in the last
	System.out.println(d);
	
}
}
