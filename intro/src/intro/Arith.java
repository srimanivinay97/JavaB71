package intro;
public class Arith{
	static int i=5;
	static int j=8;
	static int temp=0;
static int add(int a,int b) {
	return (a+b);
}
static int sub(int a,int b) {
	return (a-b);
}
static int mul(int a,int b) {
	return (a*b);
}
static int modulus(int a,int b) {
	return (a%b);
}
static int div(int a,int b) {
	return (a/b);
}
public static void main(String args[]) {
	System.out.println("Before swap i: "+i+" j: "+j);
	temp=i;
	i=j;
	j=temp;
	System.out.println("After swap  i: "+i+" j: "+j);
	System.out.println("Addition "+add(1,2)+", Subbtraction "+sub(7,9)+", Multiplication "+mul(4,5)+", Modulus "+modulus(9,18)+", Division "+div(5,20));
}}

