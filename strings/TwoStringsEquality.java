package strings;

public class TwoStringsEquality {

	public static void main(String[] args) {
// check Whether the two Strings are EQUAL or NOT,without using equals method
		
		String s1="sravan";
		String s2="sravan";
		if(s1.length()==s2.length()) {
			boolean flag=true;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				flag=false;
			break;
		}
		}
		if(flag==true)
		System.out.println("Two Strings are Equal");
		else
			System.out.println("Two Strings are NOT Equal");
		}
		else
			System.out.println("Two Strings Length is NOT Equal");
	}

}
