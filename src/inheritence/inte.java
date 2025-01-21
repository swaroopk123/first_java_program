package inheritence;
class z{
	void m9() {
		System.out.println("m9method called");
	}
}
	class y extends z {
		void m8() {
			System.out.println("method calledm8");
		}
	}

public class inte {
public static void main(String[] args) {
	z j=new z();
	j.m9();
	y i=new y();
	i.m8();
	i.m9();
}
}
