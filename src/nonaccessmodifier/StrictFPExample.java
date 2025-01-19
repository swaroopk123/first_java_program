package nonaccessmodifier;

public strictfp class StrictFPExample {
    public strictfp void calculate() {
        double value1 = 0.1;
        double value2 = 0.2;
        double result = value1 + value2;
        System.out.println("Result: " + result);
    }
    
  

    public static void main(String[] args) {
        StrictFPExample example = new StrictFPExample();
        example.calculate();
    }
}