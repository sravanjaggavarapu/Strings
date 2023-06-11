package strings;

public class SumOfAsciiDemo {

	public static void main(String[] args) {
		/* We can calculate the sum without converting to the character[] also*/
		

     String s="AaBbCc";//65+97+66+98+67+99=492
     char[] ch=s.toCharArray();
     int sum=0;
     for(int i=0;i<=ch.length-1;i++) {
    	 sum=sum+ch[i];
     }
     System.out.println(sum);
	}

}
