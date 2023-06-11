 package strings;

import java.util.Arrays;

public class New {

	public static void main(String[] args) {
		String s = "Hello World into chiiti";

		// With Split Method
		System.out.println("-----With Split() Method------");
		System.out.println();
		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
		for (int i = 0; i <= s1.length - 1; i++) {
			for (int j = i + 1; j <= s1.length - 1; j++) {
				String temp = s1[i];
				s1[i] = s1[j];
				s1[j] = temp;
			}
		}
		System.out.println(Arrays.toString(s1));
		System.out.println();

		System.out.println("-----Without Split() Method-----");
		System.out.println();

		// Without Split Method
		int start = s.length() - 1;
		StringBuffer temp = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' || i == 0) {
				int end = i;
				for (int j = end; j <= start; j++) {
					if (s.charAt(j) == ' ')
						continue;
					temp = temp.append(s.charAt(j));
				}
				start = end;
				temp = temp.append(" ");
			}
		}
		temp.deleteCharAt(temp.length() - 1);
		System.out.println(temp);
	}

}
