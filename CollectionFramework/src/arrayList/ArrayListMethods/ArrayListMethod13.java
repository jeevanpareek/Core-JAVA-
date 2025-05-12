package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod13 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.ensureCapacity(15);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);
		al.add(70);
		
		System.out.println(al);
	}
}
