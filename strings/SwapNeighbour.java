package strings;


public class SwapNeighbour {

	public static void main(String[] args) {
   String s="abcdef";   // output-->badce
  String temp="";
   char ch[]=s.toCharArray();
   for(int i=0;i<=ch.length-1;i++) {
	   for(int j=i+1;j<=ch.length-1; ) {
		   char c=ch[i];
		   ch[i]=ch[j];
		   ch[j]=c;
		   temp=temp+ch[i]+ch[j];
		   i++;
		  break;
	   }
   }
   System.out.println(temp);
	}
}
