import java.util.Arrays;

public class test {
public static void main(String[] args) {
	int[] price = {700,650,899,284};
	 
	for(int i=0;i<price.length;i++) {
		System.out.println(price[i]);
	
	}
	Arrays.sort(price);

	for(int i=0;i<price.length;i++) {
		System.out.println(price[i]);
	}
	
	 
		System.out.println("second largest no"+price[price.length-2]);
	
	
	
	
}
}
