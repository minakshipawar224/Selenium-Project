package Demo1;

import java.util.Scanner;

public class Armstrong_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int sum=0;
	
	for (int i=num;i>0;i=i/10) {
		int rem=i%10;
		
		sum=sum+(rem*rem*rem);
	}
	System.out.println(sum);
	
	if(num==sum) {
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("Not");
	}
}
}