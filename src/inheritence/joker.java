package inheritence;
 class A {
	  public void m1(){
		System.out.println("method m1"); 
	 }
 }
	  class B extends A{
		 public void m2() {
			  System.out.println("method 2");
		  }
	  }
	 class C extends A{
		 public  void m3() {
			  System.out.println("method 3");
		  }
		  
	  }
 
public class joker {
public static  void main(String[] args) {

C c1 =new C();
c1.m1();


B b1=new B();
b1.m2();
c1.m3();	
	
}
}
