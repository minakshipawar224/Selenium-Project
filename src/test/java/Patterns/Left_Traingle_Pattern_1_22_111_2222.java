package Patterns;

public class Left_Traingle_Pattern_1_22_111_2222 {
	public static void main(String[] args) {
		int col=1;
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=col;j++) {
				if(i%2==0)
				System.out.print("2 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
			col++;
		}
		
	}

}
