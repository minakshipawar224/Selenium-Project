package Demo1;


	import java.util.HashMap;
	import java.util.Set;

	public class String_Reapeating_String_In_Para {
		public static void main(String[] args) {

			String str = "abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab";

			String ar[] = str.split(" "); // [abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab]

			HashMap<String, Integer> mp = new HashMap<String, Integer>();

			
			//for(String s1:ar)
			for (int i = 0; i <= ar.length - 1; i++) {
				String s1 = ar[i];
				if (mp.containsKey(s1)) {
					mp.put(s1, mp.get(s1) + 1);
				} else {
					mp.put(s1, 1);
				}

			}
			
			
System.out.println(mp);
			//Set<String> str2 = mp.keySet(); // [abc abcd xyz]
			//for (String st : str2) {
				//System.out.println(st + ": " + mp.get(st));
			//}

		}
	}
	

