package intro;
//String Palindrome using for-loop
public class Palindrome {
static void show(String a) {
	String c="";
	for(int i=a.length()-1;i>=0;i--) {
		c+=a.charAt(i);
	}
	if(c.equals(a)) {
		System.out.println(true);
	}
	else {
		IO.println(false);
	}
}
	public static void main(String[] args) {
		String a= "1234643210";
		show(a);
	}
}
