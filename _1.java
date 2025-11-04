public class _1 {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(5,0);
            System.out.println("Result: "+ result);
        }catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            System.out.println("anyway this function will be run");
        }
    }
    public static int divideNumbers(int dividen, int divisor){
        if (divisor==0){
            throw new ArithmeticException("Cannot divide the given number by zero");
        }
        return dividen/divisor;
    }
}
