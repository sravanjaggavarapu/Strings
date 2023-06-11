package strings;

public class StringEx7 {

	public static void main(String[] args) {
		String s = "SatHyA@25YeARs";
		char[] ch = s.toCharArray();
		if (ch[0] >= 'A' && ch[0] <= 'Z')
			ch[0] = (char) (ch[0] + 32);
		s = "";
		for (int i = 0; i <= ch.length - 1; i++) {
			s = s + ch[i];
		}
		System.out.println(s);

	}
}
