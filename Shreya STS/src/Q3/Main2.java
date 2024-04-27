package Q3;
import java.lang.Cloneable;;
//Q3.1
//class Emp{
//	String name;
//	int id;
//	public Emp(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//	protected void finalize() throws Throwable{
//		System.out.println("finalize method");
//		
//	}
//}
//public class Main2 {
//public static void main(String[] args) {
//	Emp n = new Emp("shreya",07);
//	n=null;
//	System.gc();
//}
//}

//Q3.2
//class Emp{
//	String name;
//	int id;
//	public Emp(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Emp other = (Emp) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//}
//public class Main2{
//	public static void main(String[] args) {
//		Emp n = new Emp("Shreya",07);
//		Emp n1 = new Emp("Shri",07);
//		if (n.equals(n1)) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
//	}
//}

//Q3.3
//class Student{
//String sname;
//int sid;
//double sfee;
//String saddress;
//public Student(String sname, int sid, double sfee, String saddress) {
//	super();
//	this.sname = sname;
//	this.sid = sid;
//	this.sfee = sfee;
//	this.saddress = saddress;
//}
//@Override
//public String toString() {
//	return "Student [sname=" + sname + ", sid=" + sid + ", sfee=" + sfee + ", saddress=" + saddress + "]";
//}
//}
//public class Main2{
//public static void main(String[] args) {
//	Student n = new Student("shreya",07,60000,"borivali");
//	System.out.println(n);
//}
//}

//Q3.4
//class Emp implements Cloneable{
//	String name;
//	int id;
//	public Emp(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//	protected Object clone() throws CloneNotSupportedException{
//		System.out.println("clone method");
//		return super.clone();
//		
//		
//	}
//}
//public class Main2{
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Emp n = new Emp("shreya",07);
//		Emp n1 =(Emp)n.clone();
//	}
//}