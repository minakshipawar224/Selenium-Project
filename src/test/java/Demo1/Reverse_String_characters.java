package Demo1;

public class Reverse_String_characters {
public static void main(String[] args) {
	String str="Minakshi Pawar";
	String revStr="";
	System.out.println(str);
	for(int i=str.length()-1;i>=0;i--) {
		
		
		revStr=revStr+str.charAt(i);
		
	}
	
	
	System.out.println(revStr);
}
}
