package strings;

public class StringEx3 {

	public static void main(String[] args) {
		char[] ch = { 'S', 'a', 'T', 'H', 'y', 'A', '@', '1', '9', '9', '8' };
		int count = 0;
		int count1=0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				count++;
			if (ch[i] >= '0' && ch[i] <= '9')
				count1++;
		}
		System.out.println("Number Of Lowercase Character : " + count);
		System.out.println("Number Of Digits : "+count1);
	}

}
