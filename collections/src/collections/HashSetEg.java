package collections;
import java.util.*;
public class HashSetEg {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("one");
		h.add("Two");
		h.add("three");
		h.add("four");
		h.add("Two");

		Iterator i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		h.remove("three");
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
		
	}

}
