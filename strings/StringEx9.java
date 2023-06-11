package strings;

public class StringEx9 {

	public static void main(String[] args) {
		String s = "SaTHyA@25YeARs";
		char[] ch = s.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 65 && ch[i] <= 90)
				ch[i] = (char) (ch[i] + 32);
			else if (ch[i] >= 97 && ch[i] <= 122)
				ch[i] = (char) (ch[i] - 32);
		}
		System.out.println(ch);
	}

}
