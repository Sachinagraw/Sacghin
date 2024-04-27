package Q5;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
//Q5 (ArrayList)
//public class Main4 {
//public static void main(String[] args) {
//	ArrayList< String> a = new ArrayList<>();
//	
//	System.out.println("add");
//	a.add("shreya");
//	a.add("choubey");
//	System.out.println(a);
//	
//	System.out.println("update");
//	a.set(0, "Aishwarya");
//	System.out.println(a);
//	
//	System.out.println("search");
//	System.out.println(a.contains("Shreya"));
//	
//	System.out.println("Delete");
//	a.remove(0);
//	System.out.println(a);
//	
//	for (String string : a) {
//		System.out.println(string);
//	}
//	Iterator i = a.iterator();
//	for (Iterator i1 = a.iterator(); i1.hasNext();) {
//		String s = (String) i1.next();
//		System.out.println(s);
//		
//	}
//}
//}

//Q5(Linked list)
//public class Main4 {
//public static void main(String[] args) {
//	LinkedList< String> a = new LinkedList();
//	
//	System.out.println("add");
//	a.add("shreya");
//	a.add("choubey");
//	System.out.println(a);
//	
//	System.out.println("update");
//	a.set(0, "Aishwarya");
//	System.out.println(a);
//	
//	System.out.println("search");
//	System.out.println(a.contains("Shreya"));
//	
//	System.out.println("Delete");
//	a.remove(0);
//	System.out.println(a);
//	
//	for (String string : a) {
//		System.out.println(string);
//	}
//	Iterator i = a.iterator();
//	while (i.hasNext()) {
//		Object object = (Object) i.next();
//		System.out.println(object);
//	}
//}
//}

//Q5(vector)
//public class Main4 {
//public static void main(String[] args) {
//	Vector< String> a = new Vector();
//	
//	System.out.println("add");
//	a.add("shreya");
//	a.add("choubey");
//	System.out.println(a);
//	
//	System.out.println("update");
//	a.set(0, "Aishwarya");
//	System.out.println(a);
//	
//	System.out.println("search");
//	System.out.println(a.contains("Shreya"));
//	
//	System.out.println("Delete");
//	a.remove(0);
//	System.out.println(a);
//	
//	for (String string : a) {
//		System.out.println(string);
//	}
//	Enumeration e = a.elements();
//	while (e.hasMoreElements()) {
//		Object object = (Object) e.nextElement();
//		System.out.println(object);
//	}
//}
//}

//Q5(for each loop)
//public class Main4 {
//	public static void main(String[] args) {
//		Vector<String> a = new Vector();
//
//		System.out.println("add");
//		a.add("shreya");
//		a.add("choubey");
//		System.out.println(a);
//
//		for (String string : a) {
//			System.out.println(string);
//		}
//	}
//}

//Q5(iterator)
//public class Main4 {
//	public static void main(String[] args) {
//		ArrayList<String> a = new ArrayList<>();
//
//		System.out.println("add");
//		a.add("shreya");
//		a.add("choubey");
//		System.out.println(a);
//
//		Iterator i = a.iterator();
//		for (Iterator i1 = a.iterator(); i1.hasNext();) {
//			String s = (String) i1.next();
//			System.out.println(s);
//
//		}
//	}
//}

//Q5(enumerator)

//public class Main4 {
//	public static void main(String[] args) {
//		Vector<String> a = new Vector();
//
//		System.out.println("add");
//		a.add("shreya");
//		a.add("choubey");
//		System.out.println(a);
//
//		Enumeration e = a.elements();
//		while (e.hasMoreElements()) {
//			Object object = (Object) e.nextElement();
//			System.out.println(object);
//		}
//	}
//}

//Q5(list iterator)
//public class Main4{
//	public static void main(String[] args) {
//		LinkedList i = new LinkedList();
//		
//	ListIterator<String> l = i.listIterator();
//	
//	System.out.println("add");
//	l.add("shreya");
//	System.out.println(l);
//	for (Object object : i) {
//		System.out.println(object);
//	}
//	}
//}