package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod9 {
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
		
		System.out.println(al.contains(Integer.valueOf(20)));
		System.out.println(al.contains("jeevan"));
	}
}
