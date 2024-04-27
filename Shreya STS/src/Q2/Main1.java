package Q2;
//Q2.1
//class Emp{
//	String name;
//	int id;
//	double sal;
//	 String address;
//	public Emp(String name, int id, double sal, String address) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.sal = sal;
//		this.address = address;
//	}
//	void displayInfo(){
//		System.out.print("Name="+name);
//		System.out.print(",Id="+id);
//		System.out.print(",Sal="+sal);
//		System.out.print(",Address="+address);
//	}
//}
//public class Main1 {
//public static void main(String[] args) {
//	Emp n = new Emp("Shreya",07,87695,"Vasai");
//	n.displayInfo();
//}
//}

//Q2.2
//class Student{
//	String sname;
//	int sid;
//	double sfee;
//	String saddress;
//}	

//Q2.3
//class Student{
//	String sname;
//	int sid;
//	double sfee;
//	String saddress;
//	public Student(String sname, int sid, double sfee, String saddress) {
//		super();
//		this.sname = sname;
//		this.sid = sid;
//		this.sfee = sfee;
//		this.saddress = saddress;
//	}
//	@Override
//	public String toString() {
//		return "Student [sname=" + sname + ", sid=" + sid + ", sfee=" + sfee + ", saddress=" + saddress + "]";
//	}
//}
//public class Main1{
//	public static void main(String[] args) {
//		Student n = new Student("shreya",07,60000,"borivali");
//		System.out.println(n);
//	}
//}

//Q2.4
//class Emp{
//	private String name;
//	private int id;
//	private double sal;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public double getSal() {
//		return sal;
//	}
//	public void setSal(double sal) {
//		this.sal = sal;
//	}
//}
//public class Main1{
//	public static void main(String[] args) {
//		Emp n = new Emp();
//		n.setName("shreya");
//		System.out.println(n.getName());
//		n.setId(07);
//		System.out.println(n.getId());
//		n.setSal(456890);
//		System.out.println(n.getSal());
//	}
//}

//Q2.5
//class Emp{
//	void income(double sal){
//		System.out.println(sal);
//	}
//	void tax(double sal, double tax){
//		System.out.println(sal+tax);
//	}
//}
//public class Main1{
//	public static void main(String[] args) {
//		Emp n = new Emp();
//		n.income(346560);
//		n.tax(453768, 900);
//	}
//}

//Q2.6
//class Emp {
//
//	void tax(double sal, double tax) {
//		System.out.println(sal + tax);
//	}
//}
//
//class Company extends Emp {
//	@Override
//	void tax(double sal, double tax) {
//		// TODO Auto-generated method stub
//		super.tax(sal, tax);
//	}
//}
//
//public class Main1 {
//	public static void main(String[] args) {
//		Company n = new Company();
//
//		n.tax(453768, 900);
//	}
//}

//Q2.7
//abstract class Emp{
//abstract void income();
//void tax(){
//	
//}
//}
//class Comapny extends Emp{
//@Override
//void income() {
//	// TODO Auto-generated method stub
//	System.out.println("salary income");
//}
//}
//public class Main1{
//public static void main(String[] args) {
//	Comapny n = new Comapny();
//	n.income();
//}
//}

//Q2.8
//interface Operation{
//void insertData();
//void updateData();
//void deleteData();
//void showData();
//}
//class Imp implements Operation{
//@Override
//public void insertData() {
//	// TODO Auto-generated method stub
//	
//}
//@Override
//public void showData() {
//	// TODO Auto-generated method stub
//	
//}
//@Override
//public void updateData() {
//	// TODO Auto-generated method stub
//	
//}
//@Override
//public void deleteData() {
//	// TODO Auto-generated method stub
//	
//}
//}
//class Dev1 extends Imp{
//@Override
//public void insertData() {
//	// TODO Auto-generated method stub
//	super.insertData();
//	System.out.println("insert data");
//}
//@Override
//public void updateData() {
//	// TODO Auto-generated method stub
//	super.updateData();
//	System.out.println("update data");
//}
//}
//class Dev2 extends Imp{
//@Override
//public void showData() {
//	// TODO Auto-generated method stub
//	super.showData();
//	System.out.println("show data");
//}
//@Override
//public void deleteData() {
//	// TODO Auto-generated method stub
//	super.deleteData();
//	System.out.println("delete data");
//}
//}
//public class Main{
//public static void main(String[] args) {
//	Dev1 n = new Dev1();
//	n.insertData();
//	n.updateData();
//	Dev2 n1=new Dev2();
//	n1.deleteData();
//	n1.showData();
//}
//}
