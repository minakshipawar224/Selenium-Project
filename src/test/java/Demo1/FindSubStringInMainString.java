package Demo1;

import org.testng.Reporter;

public class FindSubStringInMainString {

    //str1="abcd abab cacab"
   // str2 = "ab"
		        public void findOccurence(String str, String word){
		            int count =0;
		            for(int i=0; i<str.length()-1; i++){

		                String tempWord = str.charAt(i)+""+str.charAt(i+1)+"";
		                if(tempWord.contentEquals(word)){
		                    count++;
		                }
		               // System.out.println(tempWord);
		            }
		            System.out.println("ab:" +count);
		        }


		    public static void main(String[] args) {
		    	FindSubStringInMainString findOccurencesInAString = new FindSubStringInMainString();
		        findOccurencesInAString.findOccurence("abcd abab cacab", "ab");
		    }
		
	
}
