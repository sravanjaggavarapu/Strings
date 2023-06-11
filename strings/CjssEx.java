package strings;

public class CjssEx {
	public static void main(String[] args) {
		// i/p: cjsscjsxcjss  o/p: count the number of times cjss repeated.
		
		String s="cjsscjsxcjss";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			String result=String.valueOf(s.charAt(i));
			for(int j=i+1;j<=s.length()-1;j++) {
				result=result+s.charAt(j);
			if(result.equals("cjss")) 
				count++;
			}
		}
		System.out.println("number of times cjss repeated : "+count);
										
		
		

	}


}
