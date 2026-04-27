package intro;
import java.util.Scanner;
import java.math.*;
public class Numberguessing_game {

	public static void main(String[] args) {
		int n=100;
		System.out.println("Enter numbers between 1 to 100");
		int number=(int)(Math.random()*n);
		Scanner input=new Scanner(System.in);
		int user=input.nextInt();
		if (number==user){
			System.out.println("you guessed correct");
		}
		else {
			System.out.println("wrong guess . the correct number is: "+number);
		}
		input.close();
	}

}

// this code is to generate numbers in a specific range

/*int min = 3;
int max = 8;
int rangeRandom = min + (int)(Math.random() * ((max - min) + 1));
System.out.println("Random Integer from 3 to 8: " + rangeRandom);*/
