package array;

import java.util.Arrays;

public class inearra {
public static void main(String[] args) {
	int a[]= {90,80,70};
    int b[]= {90,80,70};
    System.out.println("outputarrayequals  "+a.equals(b));
    boolean re=arrayequal( a, b);
    System.out.println(re);
}
public static  boolean arrayequal(int []a,int[] b) {
	return Arrays.equals(a, b);
}
}
