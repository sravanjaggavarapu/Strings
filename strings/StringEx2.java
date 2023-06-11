package strings;

public class StringEx2 {

	public static void main(String[] args) {
		char[] ch = { 'S', 'a', 'T', 'H', 'y', 'A', '@', '1', '9', '9', '8' };
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				System.out.println("Lowercase Character :" + ch[i]);
		}
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				System.out.println("Upper Case Charcaters " + ch[i]);
		}
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= '0' && ch[i] <= '9')
				System.out.println("Digits " + ch[i]);
		}
		for (int i = 0; i <= ch.length - 1; i++) {
			if (!((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= '0' && ch[i] <= '9')))
				System.out.println("Special Charcaters " + ch[i]);

		}

	}

}
