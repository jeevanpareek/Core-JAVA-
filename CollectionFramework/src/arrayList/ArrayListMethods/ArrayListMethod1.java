package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod1 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(2, 20);
		al.add(4, 30);
		al.add(3, 40);
		al.add(5, 50);
		al.add(1, 60);
		
		System.out.println(al);
	}
}
