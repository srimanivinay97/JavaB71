package dsa;

public class Revnum {
// reverse number
	public static void main(String[] args) {
		int a=358469;
		int b=0;
		int c=0;
		while(a>0) {
			b=a%10; //123%10->3 , 12%10->2 , 1%10->1
			a=a/10; //123/10->12 , 12/10->1 , 1/10->0
			c=c*10+b; //30-->32-->321
		}
System.out.println(c);
	}

}
