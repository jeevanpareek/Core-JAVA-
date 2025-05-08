package LIstIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(20);
		l.add("Pareek");
		l.add("Jeevan");
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
