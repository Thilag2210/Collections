package Task;
import java.util.*;
public class ReverseInArrayList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(15);
		a.add(7);
		a.add(13);
		a.add(25);
		a.add(14);
		System.out.println("Before reverse :"+ a);
		Collections.reverse(a);
		System.out.println("After reverse :"+a);

	}

}
