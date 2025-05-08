package LIstIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod2 {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(25);
		l.add("Hello");
		l.add("World");
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			li.next();
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
