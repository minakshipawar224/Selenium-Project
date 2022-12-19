import java.util.HashMap;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class ReverseString_programs {
	

    public static void main(String args[])
     {
    int arr[]= {64, 34, 25, 12, 22, 11, 90, 1, 1, 2, 4, 34, 11, 64,25,25,25,25};
   HashMap<Integer, String> map= new HashMap<Integer, String>();
     
    for(int a:arr)
    {
    	
    	if(map.containsKey(a))
    	{
    		
    		map.put(a, map.get(a)+1);
    	}
    		
    	else
    	{
    		
    		map.put(a, "1");
    	}
    	
    	Set<Integer>setvalue=map.keySet();
    	for(int b:setvalue)
    	{  int c=Integer.parseInt(map.get(b));
    		if(c>1)
    			
    		{
    			System.out.println(b+" "+map.get(b));
    		}
    	}
    }
}
    
    
}
    
    
    
    
    
    
    
    
    

