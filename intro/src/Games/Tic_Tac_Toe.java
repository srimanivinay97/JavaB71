package Games;
public class Tic_Tac_Toe {
static int num=0;
static int count=0;
static 	String board[][]=new String[3][3];
private static void initializeboard() {
	for (int i = 0;i<board.length;i++) {
		for(int j=0;j<board.length;j++) {
			board[i][j]="-" ;
		}
	}
}
private static void display() {
	IO.println("--------------");
	for (int i = 0;i<3;i++) {
		IO.print("| ");
		for(int j=0;j<3;j++) {
			IO.print(board[i][j]+" | ");
		}
		IO.println();
		IO.println("--------------");
	}
}
	public static void main(String[] args) {
		initializeboard();
		display();
	}
}
