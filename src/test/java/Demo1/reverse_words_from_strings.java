package Demo1;

public class reverse_words_from_strings {

	
	public static void main(String[] args) {
		
		String str= "Minakshi Pawar";
		str=str+" ";
		String word ="";
		char ch;
		String revnum="";
		for(int i=0;i<str.length();i++) {
		 ch=str.charAt(i);
			
			
		if(ch!=' ')
		{
			word=word+ch;
				}
		
		else 
			{revnum=word+" "+revnum;
		
		word="";
	}
}

		System.out.println(revnum);
}
	}