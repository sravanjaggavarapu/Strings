package strings;

import java.util.Arrays;

public class ShiftingRight {

	public static void main(String[] args) {
		String s = "Rossie O'Donnell";
		// 0123456789112345
		char ch[] = s.toCharArray();
		/*for (int i = 0; i <= s.length()-1; i++) {
			if(s.charAt(i)==' ')
				
			
			
		}*/for (int i = 0; i<9; i++) {
			char last = ch[ch.length - 1];// 
			for (int j = ch.length - 1; j > 0; j--) {
				
				ch[j] = ch[j - 1]; // 15-->l l
			}
			ch[0] = last;//l
		}
		System.out.println(Arrays.toString(ch));
		String s1 = new String(ch);
		System.out.println(s1);
	}

}
