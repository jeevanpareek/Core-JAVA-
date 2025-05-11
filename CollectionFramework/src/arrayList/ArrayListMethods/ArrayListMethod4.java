package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod4 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		System.out.println("Before " + al);
		
		al.set(3, "Jeevan");
		
		System.out.println("After " + al);
	}
}
