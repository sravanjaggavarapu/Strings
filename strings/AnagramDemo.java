package strings;

public class AnagramDemo {
	/*
	 * Every Character Present in First String should present in Second String Then
	 * two Strings Called as Anagram
	 */
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			for (int i = 0; i <= ch1.length - 1; i++) {
				for (int j = i + 1; j <= ch1.length - 1; j++) {
					if (ch1[i] > ch1[j]) {
						char temp = ch1[j];
						ch1[j] = ch1[i];
						ch1[i] = temp;
					}
					if (ch2[i] > ch2[j]) {
						char temp = ch2[j];
						ch2[j] = ch2[i];
						ch2[i] = temp;
					}

				}

			}

			boolean flag = true;
			for (int k = 0; k <= ch1.length - 1; k++) {
				if (ch1[k] != ch2[k]) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.println("Two Strings are Anagram");
			else
				System.out.println("Two Strings are NOT Anagrams");

		} else
			System.out.println("Two Strings are NOT Anagram");
	}

}
