package enumerationCursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationMethods {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(10);
		v.add("Jeevan");
		v.add("pareek");
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
