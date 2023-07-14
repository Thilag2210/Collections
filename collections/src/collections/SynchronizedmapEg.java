package collections;
import java.util.*;

public class SynchronizedmapEg {

	public static void main(String[] args) {
	Map m=new HashMap();
	m.put(1, "kamal");
	m.put(2, "rajesh");
	m.put(3," raj");
	Map m1= Collections.synchronizedMap(m);
	System.out.println(m1);
	}

}
