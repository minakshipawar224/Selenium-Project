import java.util.HashMap;
import java.util.Set;

public class demo2 {
public static void main(String[] args) {
		
		String str="Today is Friday";
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		for(int i=0; i<=str.length()-1; i++)
		{
		    
		    char ch=str.charAt(i);
		
				
		
		if (map.containsKey(ch))
		{
		    map.put(ch,map.get(ch)+1);
		}
		else 
		{
		    map.put(ch,1);
		}
		}
		
		Set<Character> SetValues=map.keySet();
		
		for(Character Value:SetValues)
		{
		    System.out.println(Value+" "+ map.get(Value));
		}
		}
	
}
