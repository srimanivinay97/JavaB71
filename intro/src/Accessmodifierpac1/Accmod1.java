package Accessmodifierpac1;

//in this file i performed private access modifier
// private can be only accessed within the class
public class Accmod1 {
	static {
		IO.println("static block in file1 pac1");
}
	{
		IO.println("instance block in file1 pac1");
	}
	//default DM
	//we can access default DM inside and outside the class also. but not outside of the package.
	//if there is no constructor then default constructor scope will be class scope. 
	//constructor should be public to access outside package
	public int i2=7;
	public String name2="dhoni";
	
	 void method2() {
		IO.println("default method2 from pac1");
	}
	
	//private data members
	private int i1=9;
	private String name1="vinay";
	
	//private constructor
	public Accmod1(){
		IO.println("no arg constructor");
	}
	
	//private method
	private void method1() {
		IO.println("Private method1 from pac1");
	}
	

	//protected 
	//protected DM can be accessed within the classes, within the packages . 
	//but to access in other packages we need to create a subclass obj reference not superclass obj reference.
	protected int i3=3;
	protected String name3="pro";
	
	protected void method3() {
		IO.println("pro method3 from pac1");
	}
	
	public static void main(String[] args) {
		//accessing the private data members within the class
		IO.println("main method started from pac1 file1");
		Accmod1 a1=new Accmod1();
		IO.println(a1.i1);
		IO.println(a1.name1);
		a1.method1();
		//default
		IO.println(a1.i2);
		IO.println(a1.name2);
		a1.method2();
		IO.println("main method ended from pac1 file1");

	}
	private class V{
		
	}

}
