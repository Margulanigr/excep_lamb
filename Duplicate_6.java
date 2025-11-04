import java.util.*;
public class Duplicate_6 {
    public static void main(String[] args){
        try{
            List <Integer> numbers = readNumbersfromUsre();
            checkDuplicate(numbers);
            System.out.println("No duplicate numbers!");
        }catch (Duplicate_Number_Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
    public static List <Integer> readNumbersfromUsre(){
        List <Integer> numbers = new ArrayList< >();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to input? ");
        int count = scanner.nextInt();

        System.out.println("Input the Integers: ");
        for (int i= 0;i<count; i++){
            int num = scanner.nextInt();
            numbers.add(num);
        }
        scanner.close();
        return numbers;
    }
    public static void checkDuplicate(List <Integer> numbers)throws Duplicate_Number_Exception{
        Set <Integer> uniqueNumbers = new HashSet<>();

        for (int num: numbers){
            if (uniqueNumbers.contains(num)){
                throw new Duplicate_Number_Exception("Duplicate number found: "+ num);
            }
            uniqueNumbers.add(num);
        }
    }
}
class Duplicate_Number_Exception extends Exception{
    public Duplicate_Number_Exception(String message){
        super(message);
    }
}
