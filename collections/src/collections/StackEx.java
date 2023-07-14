package collections;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println(s.isEmpty());
		s.push(100);
		s.push(150);
		s.push(200);
		System.out.println(s.isEmpty());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(150));
		System.out.println(s.search(105));
		
	}

}
