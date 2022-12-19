package Frame;

import java.util.HashSet;

public class Bike9{  
	public static void main (String[ ] args){
		HashSet<String> names = new HashSet <String>( ) ;
		names.add("banana”);
		names.add(“cherry”);
		names.add(“apple”);
		names.add(“kiwi”);
		names.add(“banana”);
		System.out.println (names);
	}
}
