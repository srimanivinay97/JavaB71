package intro;

public class Switchfile {

	public static void main(String[] args) {
		String day="fj";
		String result=switch(day) {
		case "monday","tuesday" ->"8am";
		case "wednesday","thursday","friday"->"8:30am";
		default -> "11am";
		};
		System.out.println(result);

	}

}
