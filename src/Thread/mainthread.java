package Thread;
 

public class mainthread {
public static void main(String[] args) {
	
	gatherthread j=new gatherthread();
	Thread k=new Thread(j,"skthread");
	k.start();
}
}
