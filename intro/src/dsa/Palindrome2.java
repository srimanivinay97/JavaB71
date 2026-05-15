package dsa;
import java.util.Scanner;

//palindrome for a single word
public class Palindrome2 {
	static boolean ispalindrome(String word) {
		int right=word.length()-1;
		int left=0;
		while(left<right) {
			if(word.charAt(left)!=word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word to check palindrome ");
		String palin=sc.next();
		if(ispalindrome(palin)) {
			System.out.println("yes it is a palindrome");
		}
		else {
			System.out.println("no it is not a palindrome");
		}
		sc.close();
	}
}
