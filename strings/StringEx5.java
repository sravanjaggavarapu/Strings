package strings;

public class StringEx5 {

	public static void main(String[] args) {
		char[] ch = { 'S', 'a', 'T', 'H', 'y', 'A', '@', '1', '9', '9', '8' };
		int count = ch.length;
		int s = count;
		System.out.println("length of array count : " + count);
		int OriginalNumber = count;
		double count1 = 0;
		while (count > 0) {
			count = count / 10;
			count1++;
		}
		double sum = 0;
		while (OriginalNumber > 0) {
			double r = OriginalNumber % 10;
			sum = sum + Math.pow(r, count1);
			OriginalNumber = OriginalNumber / 10;
		}
		if (sum == OriginalNumber)
			System.out.println(s + " is Armstrong  Number");
		else
			System.out.println(s + " is NOT Armstrong Number");

	}

}
