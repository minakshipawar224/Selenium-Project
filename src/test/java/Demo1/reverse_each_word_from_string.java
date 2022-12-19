package Demo1;

public class reverse_each_word_from_string {

	
	
public static void main(String[] args) {
	String str="Minakshi Pawar";
	String revString="";
	String[] word=str.split(" ");
	
	for(String w:word)
	{
		String revWord="";
	for(int i=w.length()-1;i>=0;i--)
	{
		
		revWord=revWord+w.charAt(i);
	}
		revString=revString+revWord+" ";
	
	}
	System.out.println(revString);
}	
}
