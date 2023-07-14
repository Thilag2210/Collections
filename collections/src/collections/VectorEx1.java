package collections;
import java.util.Vector;
public class VectorEx1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(200);
		v.add(400);
		v.add(500);
		System.out.println(v);
		System.out.println(v.elementAt(5));
		System.out.println(v.remove(3));
		System.out.println(v);
		System.out.println(v.clone());
		v.insertElementAt(101, 0);
		System.out.println(v);
		v.clear();
		System.out.println(v);  
	
		
		
		
	}

}
