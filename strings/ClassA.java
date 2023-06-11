package strings;

public class ClassA {

	public static void main(String[] args) {
		String s = "SatHyA@25YeARs";
		char[] ch = s.toCharArray();
		s = "";
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
				s = s + ch[i];
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
				s = s + ch[i];
			}
		}
		System.out.println(s);

	}

}
