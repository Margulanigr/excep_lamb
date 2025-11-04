import java.util.function.BiFunction;

public class concaten_10 {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

        String string1 = "Good ";
        String string2 = "Morning!";
        System.out.println("Original strings: " + string1 + ", " +string2);
        String result = concatenate.apply(string1, string2);

        System.out.println("\nConcatenated string: " + result);
    }
}
