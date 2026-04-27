package intro;
import java.util.Scanner;
public class Assin {
	
	static Scanner sc=new Scanner(System.in);
	static {
		IO.println("Enter marks for Maths");
	}
	static double maths=sc.nextDouble();
	static {
		IO.println("Enter marks for Science");
	}
	static double science=sc.nextDouble();
	static {
		IO.println("Enter marks for English");
	}
	static double english=sc.nextDouble();
	static {
		IO.println("Enter marks for Social");
	}
	static double social=sc.nextDouble();
	static {
		IO.println("Enter marks for Telugu");
	}
	static double telugu=sc.nextDouble();
	static double per(double ma,double sc,double en,double so,double te) {
		double result=ma+sc+en+so+te;
		double perc=(result/500)*100f;
		return perc;
	}
	public static void main(String[] args) {
		IO.println("Percentage "+per(maths,science,english,social,telugu)+"%");
	}
}
