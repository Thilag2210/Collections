package collections;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Ravi");
		l.add("thilagaraj");
		l.add("dinesh");
		l.add("kgf");
		System.out.println(l.size());
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			}
		
		}
	

}
