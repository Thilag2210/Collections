package Task;
import java.util.*;
public class CloneAHashset {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(15);
		h.add(26);
		h.add(35);
		System.out.println(h);
		System.out.println("new cloned elementss:"+h.clone());
	}

}
