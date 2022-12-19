package Demo1;

public class Demo {
	public static void main(String[] args) {
		
	
	String str="Good Afternoon";
	String revString="";
	String[] arr=str.split(" ");

	for(String a:arr)
	{
		String revWord="";
		for(int i=a.length()-1;i>=0;i--) {
			
			revWord=revWord+a.charAt(i);
		}
		revString=revWord+revString+" ";
	}
	System.out.println(revString);
}
}