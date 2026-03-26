package intro;
import java.util.*;


public class Test {
			
	
	public static void main(String[] args) {
		long n=0;
		Scanner input=new Scanner(System.in);
		
		while(!input.hasNextLong()) {
			System.out.println("n can't be fitted anywhere.");
			input.nextLong();
		}
		n=input.nextLong();
		System.out.println(n+"hi");
		input.close();
	}

}
