import java.util.Arrays;
import java.util.List;
public class conver_string_3 {
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        System.out.println("\nOriginal strings:");
        for (String str : stringList){
            System.out.println(str);
        }
        stringList.replaceAll(str -> str.toLowerCase());

        System.out.println("\nLowercase strings:");
        for (String str : stringList){
            System.out.println(str);
        }
        stringList.replaceAll(str ->str.toUpperCase());

        System.out.println("\nUppercase strings:");
        for (String str : stringList){
            System.out.println(str);
        }
    }
}
