package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod6 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("Jeevan");
		al.add(20);
		al.add(10);
		al.add("Jeevan");
		al.add(40);
		al.add(10);
		al.add("Jeevan");
		al.add(60);
		
		System.out.println("Before " + al);
		
		al.remove(Integer.valueOf(10));
		al.remove("Jeevan");
		
		System.out.println("After " + al);
	}
}
