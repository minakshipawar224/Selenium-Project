package Demo1;

import java.util.Arrays;

public class array_sorting {

	public static void main(String[] args) {
		
		int ar[] = {20,50,40,30,20};

		for (int i = 0; i <= ar.length-1; i++) {
		Arrays.sort(ar);
		System.out.println(ar[i]);}
		int max = ar[ar.length - 1];  
		int min = ar[0];            
		System.out.println("max no is:"+max);
		System.out.println("min no is:"+min);	
}}