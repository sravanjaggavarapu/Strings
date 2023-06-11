package strings;

public class MaximumWord {

	public static void main(String[] args) {
		String s = "everyone in the class please be silentand";

		String[] str = s.split(" ");
		int max = 0;
		String temp = "";
		for (int i = 0; i <= str.length - 1; i++) {
			int count = str[i].length();
			if (max < count) {
				max = count;
				temp = str[i];
			}
		}
		System.out.println("maximum character length : " + max);
		System.out.println("maximum Character is : " + temp);

		// Without Split() Method not possible

	}
}
