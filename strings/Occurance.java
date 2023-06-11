package strings;

public class Occurance {

	public static void main(String[] args) {
		String s = "Hi Howi arae yyoouu";
		boolean visited[] = new boolean[s.length()];
		for (int i = 0; i <= s.length() - 1; i++) {
			int count = 1;

			if (visited[i] == true || s.charAt(i) == ' ')
				continue;
			for (int j = i + 1; j <= s.length() - 1; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(s.charAt(i) + "  : " + count);

		}
	}

}
