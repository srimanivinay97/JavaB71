package lab;
import java.util.Scanner;
// creating a pizza menu using switch case
public class Menu {
	static double vegpizza=300;
	static double chickenpizza=400;
	static double vegburger=150;
	static double cheeseburger=180;
	static double coke=40;
	static double juice=50;
	static double cart=0.0F;
	static int quantity=0;
	static String items;
	static String g="";
	static String menu;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(!g.equals("q")) {
			g="";
			menu="";
			System.out.println("Main Menu "+ "\n"+"Pizza"+"\n"+"Burger"+"\n"+"Drinks");
			System.out.println("enter the menu option");
			menu=sc.next();
			switch(menu) {
			case "pizza": {
					while(g.equals("")||g.equals("p")) {
						System.out.println("Pizza menu");
						System.out.println("please select the option to add");
						System.out.println("1.vegpizza - 300rs"+"\n"+"2.chickenpizza - 400rs");
						int pizzas=sc.nextInt();
						System.out.println("enter quantity: ");
						int quantity=sc.nextInt();
						if (pizzas==1) {
							cart+=(vegpizza*quantity);	
							//items="Veg pizza"+"\n";
						}
						if (pizzas==2) {
							cart=cart+(chickenpizza*quantity);
							//items="Chicken pizza"+"\n";

						}
						switch(pizzas) {
						case 1->System.out.println("Veg pizza added to cart");
						case 2->System.out.println("Chicken pizza added to cart");
						default->System.out.println("please enter valid input in pizza");
						}
						System.out.println("enter p to repeate this menu "+"\n"+"enter m to go to main menu "+"\n"+"enter q to exit and print total bill ");
						 g=sc.next();
						 if (g.equals("q")) {
							 break;
						 }
					}	
			}
			case "burger": {
					while(g.equals("")||g.equals("p")) {
						System.out.println("Burger menu");
						System.out.println("please select the option to add");
						System.out.println("1.veg burger - 150rs"+"\n"+"2.cheese burger - 180rs");
						
						int pizzas=sc.nextInt();
						System.out.println("enter quantity: ");
						int quantity=sc.nextInt();
						if (pizzas==1) {
							cart=cart+(vegburger*quantity);
						}
						if (pizzas==2) {
							cart=cart+(cheeseburger*quantity);
						}			switch(pizzas) {
						case 1->System.out.println("Veg burger added to cart");
						case 2->System.out.println("Cheese burger added to cart");
						default->System.out.println("please enter valid input");
						}
						System.out.println("enter p to repeate this menu "+"\n"+"enter m to go to main menu "+"\n"+"enter q to exit and print total bill ");
						g=sc.next();
						if (g.equals("q")) {
							 break;
						 }	
					}
			}
			case "Drinks": {
				while(g.equals("")||g.equals("p")) {
					System.out.println("Drinks menu");
					System.out.println("please select the option to add");
					System.out.println("1.coke - 40rs"+"\n"+"2.juice - 30rs");
					
					int pizzas=sc.nextInt();
					System.out.println("enter quantity: ");
					int quantity=sc.nextInt();
					if (pizzas==1) {
						cart=cart+(coke*quantity);
					}
					if (pizzas==2) {
						cart=cart+(juice*quantity);
					}
					switch(pizzas) {
					case 1->System.out.println("coke added to cart");
					case 2->System.out.println("juice added to cart");
					default->System.out.println("please enter valid input");
					}
					System.out.println("enter p to repeate this menu "+"\n"+"enter m to go to main menu "+"\n"+"enter q to exit and print total bill ");
					g=sc.next();
					if (g.equals("q")) {
						 break;
					 }
				}
			}
			}
		}
		sc.close();
		//System.out.println("Total items: "+items);
		System.out.println("Total Bill: "+cart);
	}
}
