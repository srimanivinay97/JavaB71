package methodoverrid;

class Boy{
	int a=10;
}
class Girl extends Boy{
	
	int b=20;
}
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl p=new Girl();
		IO.println(p.a);
		IO.println(p.b);
		
	}

}
