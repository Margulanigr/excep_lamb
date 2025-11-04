import java.util.Arrays;
import java.util.List;

public class sort_str_5 {
    public static void main(String[] args) {
        // Создаем список строк
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        // Печатаем исходный список строк
        System.out.println("Original strings:");
        for (String str : colors) {
            System.out.print(str + " ");
        }

        // Сортируем список строк в алфавитном порядке с помощью лямбда-выражения
        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        // Печатаем отсортированный список строк
        System.out.println("\nSorted strings:");
        for (String str : colors) {
            System.out.print(str + " ");
        }
    }
}
