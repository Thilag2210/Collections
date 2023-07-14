package collections;
import java.util.*;
public class QueueEg {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.add("Thilagaraj");
		q.add("dinesh");
		q.add("wolf");
		System.out.println(q);
		System.out.println("Head :"+q.element());
		System.out.println("head :"+q.peek());
		Iterator i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		q.remove();
		q.poll();
		System.out.println("After remove two elements:");
		Iterator i1=q.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
