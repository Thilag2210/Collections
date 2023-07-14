package Task;
import java.util.*;
public class MiddleElementInLinkedList {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(15);
		l.add(16);
		l.add(18);
		l.add(25);
		l.add(35);
		l.add(17);
		System.out.println(l);
		Object a=l.get(l.size()/2);
		System.out.println(a);
	}

}
