package Task;
import java.util.*;
public class RemoveDupInArrayList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		System.out.println(a);
		LinkedHashSet s=new LinkedHashSet(a);
		a.clear();
		a.addAll(s);
		System.out.println(a);

	}

}
