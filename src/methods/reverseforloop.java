package methods;

public class reverseforloop {
public static void main(String[] args) {
	String s="swaroop";
   String rev="";
   System.out.println(s.length() );
   for(int i=s.length()-1;i>=0;i--) {
//   for(int i=s.length()-1;i>=0;i--) {
//	   rev+=s.charAt(i);
//	   
//   }
  
  rev= rev+=s.charAt(i);
   }
   
   System.out.println(rev);
}
}
