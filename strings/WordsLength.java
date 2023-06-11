package strings;

public class WordsLength {

	public static void main(String[] args) {
		String s = "amar code core java well";
		String temp = "";
		int start = 0;
		int end = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == ' ')
				end = i;
			for (int j = end; j >= start; j--) {
				temp = temp + s.charAt(i);
				int count=temp.length();
			}
		}
	}

}
