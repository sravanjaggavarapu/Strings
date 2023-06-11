package strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "There is a cat";
		String result = "";
		int end = 0;
		int start=0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == ' '|| i==s.length()-1) {
			     start=i;	
			for(int j=start;j>=end;j--) {
				if(s.charAt(j)==' ' )
					continue;
				
				result=result+s.charAt(j);
			}
			end=i;
			result=result+" ";
			}
			
		}
		System.out.println(result);
	}
}
