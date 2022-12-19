package Patterns;

public class Left_traingle_pattern {

	public static void main(String[] args) {
		int col=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print("* ");
			}
			System.out.println();
			col--;
		}
	}
}
