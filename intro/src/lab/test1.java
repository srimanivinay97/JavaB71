package lab;

import java.util.Scanner;

public class test1 {
	
static String swift(String day) {
	return switch(day) {
	case "monday","tuesday" ->"8am";
	case "wednesday","thursday","friday"->"8:30am";
	default -> "11am";
	};
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(swift(sc.next()));

	}

}
