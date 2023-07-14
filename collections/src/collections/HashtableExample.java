package collections;
import java.util.*;
public class HashtableExample {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(100,"ravi");
		h.put(103,"ra");
		h.put(101,"rocky");
		h.put(102,"rajesh");
		
		System.out.println(h);
		h.remove(103);
		System.out.println(h);
		System.out.println(h.getOrDefault(101,"not found"));
		System.out.println(h.getOrDefault(105, "not found"));
		System.out.println(h.getClass());
		System.out.println(h.putIfAbsent(104, "Dhoni"));
		System.out.println(h.putIfAbsent(101, "rocky"));
		System.out.println(h.putIfAbsent(102, "mental"));
		System.out.println(h);
	}

}
