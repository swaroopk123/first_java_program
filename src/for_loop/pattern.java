package for_loop;
import java.util.Scanner;
public class pattern {
public static void main(String[] args) {
	
//	System.out.println("enter the number");
//	Scanner sc=new Scanner(System.in);
	//int s=sc.nextInt();
	for(int i=1;i<=7;i++){
		for(int j=1;j<=7;j++) {
			if( j==1||i==7) 
				System.out.println("+");
			else
				System.out.println("");
			
			System.out.println();
		}

	}
	
}
}
