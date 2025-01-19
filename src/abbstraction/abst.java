package abbstraction;
 abstract class u{
	 abstract void h();
 }
 class a extends u{
	 void h() {
		 System.out.println("a method called");
	 }
	 class z extends u{
		 void h() {
			 System.out.println("extends class z");
		 }
	 }
 }
public class abst {
public static void main(String[] args) {
	
	u i=new a();
	i.h();

}
}
