package Demo1;

public class Prime {
public static void main(String[] args) {
	int num=7;
	int count=0;
	
	
	for(int  i=2; i<=num;i++) {
		if(num%10==0)
		count++;
		break;
	}
	if(count==1) {
		System.out.println("Not prime no");
	}
	else {
		System.out.println(" prime");
	}
}
}
