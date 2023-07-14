package collections;
import java.util.ArrayList;
public class ArratList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add("Dhoni");
		al.add("Raina");
		al.add("Bravo");
		System.out.println(al);
		System.out.println(al.size());
		al.add("conway");
		System.out.println(al);
		System.out.println(al.lastIndexOf("Bravo"));
		al.remove("conway");
		System.out.println(al);
		al.set(1, "tilakvarma");
		System.out.println(al);
	}

}
