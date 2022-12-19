package Demo1;

public class Palindrom_number {
public static void main(String[] args) {
	String original="abcba";
	String revoriginal="";
	for(int i=original.length()-1;i>=0;i--) {
		revoriginal=revoriginal+original.charAt(i);
	}
	System.out.println(revoriginal);
	
	if(revoriginal.equals(original)) {
		System.out.println("Given string is palindrom");
	}
	else
		{
		System.out.println("Not");
		}
}
}
