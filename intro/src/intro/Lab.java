package intro;
import java.util.Scanner;
public class Lab{
	static Scanner sc=new Scanner(System.in);
	static void switchcase3() {
		int a=sc.nextInt();
		switch(a) {
		case 1->System.out.println("Monday");
		case 2->System.out.println("Tuesday");
		case 3->System.out.println("Wednesday");
		case 4->System.out.println("Thursday");
		case 5->System.out.println("Friday");
		case 6->System.out.println("Saturday");
		case 7->System.out.println("Sunday");
		default->System.out.println("enter number has no week");
		};
	}	
	static void fizzbuzz() {
		IO.println("this is fizzbuzz");
		int a=sc.nextInt();
		
		if (a%3==0) {
			System.out.println("Fizz");
		}
		else if (a%5==0) {
			System.out.println("Buzz");
		}
		else if (a%3==0 && a%5==0) {
			System.out.println("FizzBuzz");
		}
		else {
			System.out.println(a);
		}
		sc.close();
	}
	public static void main(String arg[]) {
		switchcase3();
		fizzbuzz();
	}
}
