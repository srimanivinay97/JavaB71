package intro;

public class Primenum {

	public static void main(String[] args) {
		int a=50;
		for(int i=2;i<=a;i++) {
			int count=0;
			for(int j=2;j<10;j++) {
				if (i/j==0) {
					++count;	
				}
			}
			if (count>0 && count<2) {
				System.out.println(i);
			}
		}

	}

}
