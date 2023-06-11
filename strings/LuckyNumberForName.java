package strings;

public class LuckyNumberForName {

	public static void main(String[] args) {
		// Lucky Number For My Name
		
		String s="sravan";
	    int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			sum=sum+s.charAt(i);
		}
		System.out.println(sum);
		int sum1=0;
        while(sum>0) {
        	int r =sum%10;
        	sum1=sum1+r;
        	sum=sum/10;
        }
        int sum2=0;
        while(sum1>0) {
        	int r1=sum1%10;
        	sum2=sum2+r1;
        	sum1=sum1/10;
        }
        System.out.println("Lucky Number : "+sum2);
	}

}
