package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethods {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(10);
		l.add("Jeevan");
		l.add("Pareek");
		
//		System.out.println(l);
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
