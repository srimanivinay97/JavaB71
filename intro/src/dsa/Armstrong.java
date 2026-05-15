package dsa;
import java.util.Scanner;
public class Armstrong {
	static int lenofarm(int n) {
		int r;
		int count=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			count++;
		}
		return count;
	}
	static boolean isarm(int n,int len) {
		int r=0;
		int sum=0;
		int temp=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			int a=r;
			for(int i=len-1;i>0;i--) {
				a=r*a;
			}
			sum+=a;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int arm=sc.nextInt();
		int len=lenofarm(arm);
		if(isarm(arm,len)) {
			System.out.println("yes the num is Armstrong");
		}
		else {
			System.out.println("no the num is not Armstrong");
		}
		sc.close();
	}
}
