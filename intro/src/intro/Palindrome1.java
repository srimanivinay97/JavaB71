package intro;
//String Palindrome using for-loop
public class Palindrome1 {
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
		String a= "123464321";
		show(a);
	}
}
