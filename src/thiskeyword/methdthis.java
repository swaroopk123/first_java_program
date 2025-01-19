package thiskeyword;

public class methdthis {
	
	void m1(methdthis p) {
//		m3(this);
		System.out.println("this keyword using method calling method m1");
	}
	void m2() {
		m1(this);
		System.out.println("m2 method ends");
	}
	void m3(int a) {
		System.out.println("m3 method called");
	}
public static void main(String[] args) {
	methdthis o=new methdthis();
	o.m2();
}
}
