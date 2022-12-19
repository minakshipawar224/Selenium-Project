package Demo1;

import java.util.Random;

import com.google.common.collect.RangeMap;
import com.google.common.collect.RangeSet;

public class Find_duplicate_elements_in_Array {

	public static void main(String[] args) {

		//int arr[]= {2,3,4,2,5};
		String arr[]= {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" ,"JDBC", "java"};
		for (int i=0; i<=arr.length-1;i++) {
			
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
	
}
}