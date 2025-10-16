package priorityQueueConcept;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueIntro {
	public static void main(String[] args) {
	//	PriorityQueue<Integer> a=new PriorityQueue<>();
		Queue<Character> q=new PriorityQueue<>();
		q.add('a');
		q.add('b');
		q.offer('s');
		q.add('c');
		q.add('d');
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
	}

	

}
