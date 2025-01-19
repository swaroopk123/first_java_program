package object;


	class Example implements Cloneable {
	    String message = "Cloned Object";

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	}

	public class Main {
	    public static void main(String[] args) throws CloneNotSupportedException {
	        Example original = new Example();
	        Example cloned = (Example) original.clone(); // Cloning
	        System.out.println(cloned.message); 
	        System.out.println(cloned.getClass().getName());
	        
	        // Output: Cloned Object
	    }
	}

