package Patterns;

public class Left_Traingle_Pattern_1_12_123_1234 {
	public static void main(String[] args) {
		int col=1;
		
		
		for(int i=1; i<=5; i++) {
			int p=1;
			for(int j=1;j<=col;j++) {
				System.out.print(p++);
			}
			System.out.println();
			col++;
		}
		
	}

}
