package collections;
import java.util.*;
public class TreemapEg {

	public static void main(String[] args) {
	TreeMap t=new TreeMap();
	t.put(1, "tamil");
	t.put(2, "English");
	t.put(3, "maths");
	System.out.println("before :"+t);
	t.put(3, "tamil");
	t.put(2, "English");
	t.put(1, "maths");
	System.out.println("After :"+t);
	System.out.println(t.descendingMap());
	              
	}

}
