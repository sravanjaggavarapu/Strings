package strings;

public class ArrangeInFrequencyOfWord2 {

	public static void main(String[] args) {
		// Program Without Using Split Method
		
		String s = "learn coding in java";
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		char temp = ' ';
		System.out.println(ch.length);
		for (int i = 0; i <= ch.length - 1; i++) {
			if(ch[i]==' ') {
		for (int j = i + 1; j <= ch.length - 1; j++) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;				
		}
		sb=sb.append(ch[i]);
	}
	}
		System.out.println(sb);

	}

}
