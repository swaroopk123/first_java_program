package thiskeyword;
 class A{
	A(thisvarible td){
		System.out.println("this keyword use and constructor throw call ");
	}
}
public class thisvarible {
	
		void m1() {
			System.out.println("output");
A j=new A(this);
		
	}
public static void main(String[] args) {
	thisvarible i=new thisvarible();
	i.m1();
}
}
