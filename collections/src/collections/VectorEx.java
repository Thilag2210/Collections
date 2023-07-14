package collections;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("tamil");
		v.add("english");
		v.add(46);

		v.addElement("maths");

		Iterator i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Iterator i1=v.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println(i.hashCode());
		System.out.println(v.size());
		Vector v1=new Vector(7);
		System.out.println(v1.capacity());System.out.println(v.capacity());
		
		if(v.contains("maths")) {
			System.out.println("maths index "+v.indexOf("maths")+" is "+"true");
		}
		System.out.println(v.firstElement());
		System.out.println();

	}

}
