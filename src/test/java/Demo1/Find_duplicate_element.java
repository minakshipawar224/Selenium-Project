package Demo1;

import java.util.HashMap;
import java.util.Set;

public class Find_duplicate_element {
	public static void main(String[] args) {

		String[] arr = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java" ,"JDBC", "java"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		{
		for (String str : arr) {
			if (map.containsKey(str)) 
			{
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		Set<String> setValue = map.keySet();  //{"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java" ,"JDBC"}
		for (String str : setValue) {
		//	if (map.get(str) > 1) {
				System.out.println(str + ": " + map.get(str));
		//	}
		}
	}
}}
