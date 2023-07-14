package Task;
import java.util.*;
public class UnionOfTwoHashset {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(15);
		h.add(1);
		System.out.println(h);
		HashSet s=new HashSet();
		s.add(16);
		s.add(2);
		System.out.println(s);
		s.addAll(h);
		System.out.println(s);
	}

}
