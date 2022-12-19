package Frame;

import java.util.Arrays;

public class demo1 {
public static void main(String[] args) {
	
	
int[] arr= {20,80,40,30,60};int temp=0;
for(int i=0;i<arr.length;i++) {
System.out.println("Oiginal array");

System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			}}

System.out.println("Element after array sort");
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
System.out.println("Second highest element");
System.out.println(arr[arr.length-2]);
System.out.println("Second lowest element");
System.out.println(arr[arr.length-4]);
}
}
