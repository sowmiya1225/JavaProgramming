package queueconcept;
import java.util.Queue;
import java.util.LinkedList;
public class QueueIntro {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		q.add("lion");
		q.add("elephant");
		q.add("rabbit");
		q.add("donkey");
		q.add("monkey");
		/* q.offerFirst("panda"); cannot use the method because it is deque*/
		System.out.println(q);
		System.out.println("Poll element:"+q.poll());//first element delete and display
		System.out.println(q);
		System.out.println("Peek element:"+q.peek());//
		System.out.println(q);
		System.out.println("size:"+q.size());
		System.out.println(q);
		System.out.println("Empty check:"+q.isEmpty());
		System.out.println(q);
		//can add in last only 
		
	}

}
