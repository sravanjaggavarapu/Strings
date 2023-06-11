package strings;

public class StringEx1 {
	public static void main(String[] args) {
		char[] ch = { 'S', 'a', 'T', 'H', 'y', 'A', '@', '1', '9', '9', '8' };
		// length
		System.out.println("Length of Character Array : "+ch.length);
		System.out.println();
		// First & Last Character

		System.out.println("First Character : " + ch[0]);
		System.out.println("Last Character : " + ch[ch.length - 1]);
		System.out.println("-----------------------------");
		if (ch[0] >= 'A' && ch[0] <= 'Z')
			System.out.println(ch[0] + " is Uppercase Character");
		System.out.println();

		if (ch[ch.length - 1] >= '0' && ch[ch.length - 1] <= '9')
			System.out.println(ch[ch.length - 1] + " is Digit");
		System.out.println();

		for (int i = 0; i <= ch.length - 1; i++) {
			if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z'))
				System.out.println(ch[i] + " is Alphabet");
		}
	}

}
