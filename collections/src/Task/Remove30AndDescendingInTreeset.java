package Task;
import java.util.*;
public class Remove30AndDescendingInTreeset {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		System.out.println(t);
		Vector h=new Vector(t);
		System.out.println(h.remove(2));
		System.out.println(h);
		TreeSet t1=new TreeSet(h);
		System.out.println(t1.descendingSet());

	}

}
