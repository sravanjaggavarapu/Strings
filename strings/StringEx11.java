package strings;

public class StringEx11 {

	public static void main(String[] args) {
		String s1 = "Sathya";
		String s2 = "S@thya";
		if (s1.length() == s2.length()) {
			boolean flag = true;
			for (int i = 0; i <= s1.length() - 1; i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.println("Two Strings are Equal");
			else
				System.out.println("Two Strings are NOT Equal ");

		} else
			System.out.println("Two Strings LENGTH is NOT Equal");

	}

}
