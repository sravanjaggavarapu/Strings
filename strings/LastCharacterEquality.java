package strings;

public class LastCharacterEquality {

	public static void main(String[] args) {
String s1="sathya";
String s2="$@thy@";
if(s1.length()==s2.length()) {
	if(s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1))
		System.out.println("Last Character is Equal");
	else
		System.out.println("Last Charcater is NOT Equal");

	}
else
	System.out.println("Two Strings Length Not Equal");
	}
}
