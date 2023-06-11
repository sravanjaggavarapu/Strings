package strings;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String s = "aabbcdeacbefaecf";
		boolean visited[] = new boolean[s.length()];
		String temp = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			if (visited[i] == true)
				continue;
			
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					visited[j] = true;
				}
			}
			temp = temp + s.charAt(i);
		}
		
		System.out.println(temp);

	}

}
