package Demo1;

import java.util.Scanner;

public class Accept_input_from_user {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
		
	System.out.println("Enter a String");
	String str=scan.next();
	
	System.out.println("Enter boolean");
	Boolean b=scan.hasNext();
}
}
