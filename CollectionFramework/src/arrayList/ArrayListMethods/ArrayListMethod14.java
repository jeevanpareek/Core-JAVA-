package arrayList.ArrayListMethods;

import java.util.ArrayList;

public class ArrayListMethod14 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.ensureCapacity(125);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		al.add(120);
		al.add(130);
		al.add(140);
		al.add(150);
		al.add(160);
		al.add(170);
		al.add(180);
		al.add(190);
		al.add(200);
		al.add(210);
		al.add(220);
		al.add(230);
		al.add(240);
		al.add(250);
		
		System.out.println("Before : " + al);
		
		al.trimToSize();
	}
}
