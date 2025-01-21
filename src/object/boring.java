package object;
//object creation factory method
class boring {
    private boring() {
        // Private constructor
    }

    public static boring createInstance() { // Factory Method
        return new boring();
    }

    
    public static void main(String[] args) {
        boring obj = boring.createInstance(); // Factory method
        System.out.println("ouput  "+obj.getClass().getSimpleName());
        System.out.println("getmethod"+obj.getClass().getName());
        System.out.println("Object created using Factory Method!");
    }
}

