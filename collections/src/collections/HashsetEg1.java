package collections;
import java.util.*;
public class HashsetEg1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("hi");
		l.add("bye");
		l.add("see you");
		l.add("welcome");
		l.add("again");
		System.out.println(l);
		HashSet hs=new HashSet(l);
		System.out.println(hs);
		LinkedHashSet ls=new LinkedHashSet(hs);
		System.out.println(ls);
	}

}
