package dsa;
import java.util.Scanner;
public class Sumofnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digits");
		int n=sc.nextInt();
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10; //123%10->3 , 12%10->2 , 1%10->1
			n=n/10; //123/10->12 , 12/10->1 , 1/10->0
			sum+=r;
		}
		sc.close();
System.out.println(sum);
	}
}
