package intro;
//Palindrome using for-loop
public class Palindrome {
static void show(String a) {
	String b=a;
	String c="";
	for(int i=b.length()-1;i>=0;i--) {
		c+=b.charAt(i);
	}
	if(c.equals(a)) {
		System.out.println(true);
	}
	else {
		IO.println(false);
	}
}
	public static void main(String[] args) {
		String a= "123464321";
		show(a);
	}
}
