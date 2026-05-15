package lab;

class parent{
	static int a=1;
	int b=2;
	static void ps() {
		System.out.println(a+":a "+"parent sta");
	}
	void pi() {
		System.out.println(b+":b"+a+":a"+"parent inst");
	}
}

class child extends parent{
	static int c=3;
	int d=4;
static void ps() {
	System.out.println("a:"+a+"b:"+"child sta");
}
void ci() {
	System.out.println("a:"+a+"b:"+"child inst");
}
}
class childson extends child{
	static int e=5;
	int f=6;
	void csi() {
		System.out.println("childson"+b);
	}
	void cssi() {
		System.out.println("a:"+a+"b:"+b+"childson inst");
	}
}
public class Test1 {
	public static void main(String[] args) {
		child p=new child();
		p.pi();
		
		
}}
