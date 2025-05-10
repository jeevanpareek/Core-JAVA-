package arrayList.arrayListConstructors;

import java.util.ArrayList;

public class ArrayListConstructor3 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		ArrayList al1 = new ArrayList(al);
		
		System.out.println(al1);
	}
}
