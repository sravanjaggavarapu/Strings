package strings;

public class ArrangeInFrequencyOfWord {

	public static void main(String[] args) {
		// Program Using Split Method 
		
		// i/p : "learn coding in java --> o/p : in java learn coding
		// 5 6 2 4
		String s = "learn coding in java";
		String[] str = s.split(" ");
		StringBuilder sb = new StringBuilder();
		String temp = " ";
		for (int i = 0; i <= str.length - 1; i++) {
			for (int j = i + 1; j <= str.length - 1; j++) {
				if (str[i].length() > str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			sb = sb.append(str[i]);
			sb = sb.append(" ");
		}
		System.out.println(sb);

	}

}
