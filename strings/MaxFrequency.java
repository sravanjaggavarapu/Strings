package strings;

public class MaxFrequency {

	public static void main(String[] args) {
		String s = "mmmmyyss";
		boolean[] visited = new boolean[s.length()];
		int max = 0;
		char ch = s.charAt(0);
		for (int i = 0; i <= s.length() - 1; i++) {
			if (visited[i] == true)
				continue;
			int count = 1;
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					visited[j] = true;
				}
				if (max < count) {
					max = count;
					ch = s.charAt(i);
				}
			}
		}
		System.out.println(ch + "--->" + max);


	}

}
