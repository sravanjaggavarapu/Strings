package strings;

public class StringEx6 {

	public static void main(String[] args) {
		String s = "SatHyA@25YeARs";
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				System.out.println(s.charAt(i));
		}

	}

}
