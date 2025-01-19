
class UnderageException extends Exception{
	UnderageException(){
		super("user this up method");
	}
	UnderageException(String message){
		super(message);
	}
}
public class coustom {
public static void main(String[] args)  {
	
int age=13;
try {
	if(18>age) {
		throw new UnderageException();
	}
	else {
		System.out.println("you are voting eligible");
	}
}catch(UnderageException e) {
	e.printStackTrace();
	//System.out.println("exceptin throw");
}
}
}
