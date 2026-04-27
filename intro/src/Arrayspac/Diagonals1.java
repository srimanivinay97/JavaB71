package Arrayspac;

public class Diagonals1 {
	
	public static void main(String[] args) {
		String name[][]= {{"DABCD"},{"DHEHF"},{"GHOIJ"},{"KNLNM"},{"INOPI"}};
		int s=name.length;
		String c="";
		String z="";
		for(int i=0;i<1;i++){
			for(int j=0;j<s;j++) {
				c+=name[j][i].charAt(j);
			}
			for(int k=s-1;k>=0;k--) {
				z+=name[k][i].charAt(k);
			}
		}IO.println(c);System.out.println(z);
	}
	
}
