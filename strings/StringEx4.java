package strings;

public class StringEx4 {
	public static void main(String[] args) {
		char[] ch = { 'S', 'a', 'T', 'H', 'y', 'A', '@', '1', '9', '9', '8' };
		int count = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
				count++;
		}
		System.out.println("Alphabets count : " + count);
		boolean flag = true;
		for (int j = 2; j <= count / 2; j++) {
			if (count % j == 0) {
				flag = false;
				break;
			}

		}
		if (flag == true)
			System.out.println(count + " is Prime Number");
		else
			System.out.println(count + " is NOT Prime Number");

	}

}
