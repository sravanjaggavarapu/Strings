package strings;

public class StringEx12 {

	public static void main(String[] args) {
		String s = "Sathya@25YeArs!";
		for (int i = 0; i <= s.length() - 1; i++) {
			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
				System.out.print(s.charAt(i));
		}
/*  Other way is to convert string to char 
 *  intialize the string s=""; 
 *  inside for loop s=s+ch[i] 
	print the s outside for loop
	*/
	}

}
