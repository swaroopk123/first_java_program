package thiskeyword;

public class thisdemo {
thisdemo(){
	//System.out.println("first called");
	this(90,"uiyi",678);
	//this(10,"yui",90);

	System.out.println("no args constructor");
}
thisdemo(int a){
	
	System.out.println("one args parameter");
}
thisdemo(int a,String b,int m){
	this(90);
	System.out.println("three agrgument");
}
public static void main(String[] args) {
	thisdemo j=new thisdemo();
	
}
}
