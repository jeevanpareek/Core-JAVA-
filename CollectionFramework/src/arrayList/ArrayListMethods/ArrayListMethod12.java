package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod12 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(40);
		al.add(70);
		
		System.out.println(al.lastIndexOf(Integer.valueOf(40)));
	}
}
