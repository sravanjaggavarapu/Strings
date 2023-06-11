package strings;

public class SumOfFirstChar {

	public static void main(String[] args) {
		// Sum of First Character Of Every Word In a String

		String s = " every one should code in java";
		int sum = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i)==' ') {
				char ch = s.charAt(i + 1);
				sum = sum + ch;    //e+o+s+c+i+j=101+111+115+99+105+106==>637
			}
		}
		System.out.println(sum);
		// One Way for Prime Number
		int count=0;
		for(int i=1;i<=sum;i++) {
			if(sum%i==0)
				count++;
		}
		if(count==2)
			System.out.println(sum+" is a Prime Number");
		else 
			System.out.println(sum+" is NOT a Prime Number");
		
		// 2nd Way for Prime Number
		
		boolean flag=true;
		for(int i=2;i<=sum/2;i++) {
			if(sum%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println(sum+" is a Prime Number");
		else
			System.out.println(sum+" is a $NOT$ aPrime Number");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
