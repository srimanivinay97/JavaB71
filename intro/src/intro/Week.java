package intro;
public class Week {	
	String name;
	String membership;
Week(){
	name="guest";
	membership="General";
	IO.println("user name: "+name);
	}
Week(String name){
	this();
	IO.println("user name registered as: "+name);
}
Week(String name,String membership){
	this("vinay");
	this.name=name;
	this.membership=membership;
}
void display() {
	IO.println("name: "+name+" Membership: "+membership);
}
	public static void main(String[] args) {
		Week u1=new Week("vinay","Premium");
		u1.display();
	}
}
