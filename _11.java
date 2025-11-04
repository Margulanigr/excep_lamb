public class _11 {
    public static void main(String[] args) {
        try {
            int numbers = Numberss(5,0);
            System.out.println("Good "+ numbers);
        }catch (ArithmeticException e){
            System.out.println("Error "+ e.getMessage());
        }
    }

    public static int Numberss(int n, int m){
        if (m==0){
            throw new ArithmeticException("Cannot divide the number by zero");
        }
        return n / m;
    }
}
