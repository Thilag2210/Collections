package Task;
import java.util.*;
public class MaximumInArrayList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(40);
		a.add(20);
		a.add(10);
		a.add(50);
		TreeSet t=new TreeSet(a);
		System.out.println(t);
		
		System.out.println(t.pollLast());

	}

}
