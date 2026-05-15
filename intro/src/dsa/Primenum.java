package dsa;

import java.util.Scanner;


public class Primenum {
	static boolean isprime(int n) {
		boolean status=true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num");
		int snum=sc.nextInt();
		System.out.println("enter second num");
		int lnum=sc.nextInt();
		System.out.println("enter the index to find the prime num");
		int fnum=sc.nextInt();
		int count=0;
		int save=0;
		for(int i=2;i<lnum;i++) {
			if(i>=snum) {
				if(isprime(i)) {
					System.out.print(i+" ");
					++count;
					if(count==fnum) {
						save+=i;
					}
				}
			}
			
		}
		System.out.println();
		System.out.println("the "+fnum+" position in the prime number is: "+save);
			
	}

}
