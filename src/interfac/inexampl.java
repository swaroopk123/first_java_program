package interfac;
interface i1{
	void m1();
}
interface i2{
	void m2();
}
class a implements i1,i2{
	public void m1(){
		System.out.println("called as m1 method");
	}
	public void m2() {
		System.out.println("called as m2 method");
	}
}
public class inexampl {
	public static void main(String[] args) {
		a n=new a();
		n.m1();
		n.m2();
	}
}
