package strings;

public class Palindrome {

	public static void main(String[] args) {
     String s="LIRIL";
     String reverse="";
     for(int i=s.length()-1;i>=0;i--) {
    	 reverse=reverse+s.charAt(i);
     }
     if(reverse.equals(s))
    	 System.out.println("Given String is a Palindrome");
     else
    	 System.out.println("Given String is NOT Palindrome");
     
	}

}
