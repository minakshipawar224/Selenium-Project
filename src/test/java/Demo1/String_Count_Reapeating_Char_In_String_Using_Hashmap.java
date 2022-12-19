package Demo1;

import java.util.HashMap;
import java.util.Set;

public class String_Count_Reapeating_Char_In_String_Using_Hashmap {

	public static void main(String[] args) {
		
		

			String str = "abcdabcdaeeeee";

			HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

			for (int i = 0; i <= str.length() - 1; i++) 
			{
				char charValue = str.charAt(i);
				
				if (mp.containsKey(charValue)) 
				{
					mp.put(charValue, (mp.get(charValue) + 1));
				} else
				{
					mp.put(charValue, 1);
				}

			}
			
			
			Set<Character> keys = mp.keySet(); //[a, b, c, d]
			for (Character key : keys) {
				System.out.println(key +": "+ mp.get(key));
			}
			
			
			
		}

	
		
	}
	

