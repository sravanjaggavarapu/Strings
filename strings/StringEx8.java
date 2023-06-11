package strings;

public class StringEx8 {

	public static void main(String[] args) {
		String s = "SatHyA@25YeARs";
		char[] ch = s.toCharArray();
		if (ch[ch.length - 1] >= 'a' && ch[ch.length - 1] <= 'z')
			ch[ch.length - 1] = (char) (ch[ch.length - 1] - 32);
		s = "";
		for (int i = 0; i <= ch.length - 1; i++) {
			s = s + ch[i];
		}
		System.out.println(s);

	}

}
