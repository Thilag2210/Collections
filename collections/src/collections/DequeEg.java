package collections;
import java.util.*;
public class DequeEg {

	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add("dream11");
		d.add("myteam11");
		d.add("vision11");
		for(Object o:d) {
			System.out.println(o);
		}
		System.out.println("After offer keyword");
		d.offer("1xbet");
		d.offer("melbet");
		
		for(Object o1:d) {
			System.out.println(o1);
		}
		System.out.println(d.pollLast());
	   System.out.println(d);
	}

}
