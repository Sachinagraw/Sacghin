package Q4;
//Q4.1
//public class Main3 {
//public static void main(String[] args) {
//	try {
//		int data = 50/0;
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}
//	System.out.println("this is the code for try and catch");
//}
//}

//Q4.2

//public class Main3 {
//public static void main(String[] args) {
//	try {
//		int data = 50/0;
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}finally {
//		System.out.println("finally block");
//	}
//	System.out.println("this is the code for try and catch and finally block");
//}
//}

//Q4.3
//public class Main3 {
//public static void main(String[] args) {
//	try {
//		int a[] = new int[5];
//		a[5]=50/0;
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}catch (ArrayIndexOutOfBoundsException e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}
//	System.out.println("this is the code for try and multicatch");
//}
//}

//Q4.4
//public class Main3{
//	void m(){
//		int data = 50;
//	}
//	void n(){
//		m();
//	}
//	void p(){
//		try {
//			n();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//					}
//	}
//	public static void main(String[] args) {
//		Main3 n = new Main3();
//		n.p();
//		System.out.println("Exception propagation");
//
//	}
//}

//Q4.5
//class Emp extends Exception{
//	public Emp(String s){
//		super(s);
//	}
//}
//public class Main3{
//	public static void main(String[] args) {
//		try {
//			throw new Emp("Sdac");
//		} catch (Emp e) {
//			// TODO: handle exception
//			System.out.println("caught the exception");
//			System.out.println(e.getMessage());
//			
//		}
//	}
//}