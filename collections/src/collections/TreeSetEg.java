package collections;
import java.util.*;
public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("Thilagaraj");
		t.add("Dinesh");
		t.add("wolf");
		t.add("Aaron finch");
		System.out.println(t);
		Iterator t1=t.descendingIterator();
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}
		System.out.println("Lowest value:"+t.pollFirst());
		System.out.println("Highest value:"+t.pollLast ());

}
}