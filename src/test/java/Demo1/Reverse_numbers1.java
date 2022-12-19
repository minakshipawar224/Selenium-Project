package Demo1;

public class Reverse_numbers1 {
public static void main(String[] args) {
	int num=23418;
	int revNum=0;
	while(num>0) {
		
		int rem=num%10;
		 revNum=revNum*10+rem;
		 num=num/10;
	}
	System.out.println(revNum);
}
}
