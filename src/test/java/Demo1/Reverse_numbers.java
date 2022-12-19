package Demo1;

public class Reverse_numbers {
	public static void main(String[] args) {
		int orgnum= 65234;
		String str=Integer.toString(orgnum);
		
		String revStr="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
			
		}
		int revNum=Integer.parseInt(revStr);
		System.out.println(revNum);
	}

}
