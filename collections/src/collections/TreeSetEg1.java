package collections;
import java.util.*;
public class TreeSetEg1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("D");
		t.add("E");
		System.out.println(t);
		System.out.println("Reverse set"+t.descendingSet());
		System.out.println("Head set"+t.headSet("C",true));
		System.out.println("tail set"+t.tailSet("C",false));
		System.out.println("Subset"+ t.subSet("B",true, "D",true));
	}

}
