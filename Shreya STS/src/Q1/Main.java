package Q1;
//Q1.2

//class Main1{
//	static String dept ="CS";
//	int id =101;
//	
//	void nonststic(){
//		System.out.println(id);
//	}
//	static void staticmeth(){
//		System.out.println(dept);
//	}
//}
//public class Main {
//public static void main(String[] args) {
//	Main1 n = new Main1();
//	n.nonststic();
//	Main1.staticmeth();
//}
//}

//Q1.3
//class Emp{
//	String name="shreya";
//	static String dept ="cs";
//	
//	void meth1(){
//		int id =101;
//		System.out.println(id);
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//	Emp n = new Emp();	
//	n.meth1();
//	System.out.println(n.name);
//	System.out.println(Emp.dept);
//	}	}

//Q1.4
//class Emp{
//	String name;
//	int id;
//	public Emp(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//	@Override
//	public String toString() {
//		return "Emp [name=" + name + ", id=" + id + "]";
//	}
//	public void displayInfo(){
//		System.out.println(toString());
//	}
//	
//}
//public class Main{
//	public static void main(String[] args) {
//		Emp n = new Emp("shreya",07);
//		n.displayInfo();
//	}
//}

//Q1.5
//class Emp{
//	void income(double sal){
//		System.out.println(sal);
//	}
//	void tax(double sal, double tax){
//		System.out.println(sal+tax);
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		Emp n = new Emp();
//		n.income(346560);
//		n.tax(453768, 900);
//	}
//}

//Q1.6
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
//public class Main {
//	public static void main(String[] args) {
//		Company n = new Company();
//
//		n.tax(453768, 900);
//	}
//}

//Q1.7
//abstract class Emp{
//	abstract void income();
//	void tax(){
//		
//	}
//}
//class Comapny extends Emp{
//	@Override
//	void income() {
//		// TODO Auto-generated method stub
//		System.out.println("salary income");
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		Comapny n = new Comapny();
//		n.income();
//	}
//}

//Q1.8
//interface Operation{
//	void insertData();
//	void updateData();
//	void deleteData();
//	void showData();
//}
//class Imp implements Operation{
//	@Override
//	public void insertData() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void showData() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void updateData() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void deleteData() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//class Dev1 extends Imp{
//	@Override
//	public void insertData() {
//		// TODO Auto-generated method stub
//		super.insertData();
//		System.out.println("insert data");
//	}
//	@Override
//	public void updateData() {
//		// TODO Auto-generated method stub
//		super.updateData();
//		System.out.println("update data");
//	}
//}
//class Dev2 extends Imp{
//	@Override
//	public void showData() {
//		// TODO Auto-generated method stub
//		super.showData();
//		System.out.println("show data");
//	}
//	@Override
//	public void deleteData() {
//		// TODO Auto-generated method stub
//		super.deleteData();
//		System.out.println("delete data");
//	}
//}
//public class Main{
//	public static void main(String[] args) {
//		Dev1 n = new Dev1();
//		n.insertData();
//		n.updateData();
//		Dev2 n1=new Dev2();
//		n1.deleteData();
//		n1.showData();
//	}
//}