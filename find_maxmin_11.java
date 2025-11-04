import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class find_maxmin_11 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
        System.out.println("Original values of the said array: "+nums);
        Optional<Integer> max = nums.stream()
                .max((x, y) -> x.compareTo(y));

        Optional<Integer> min = nums.stream()
                .min((x, y) -> x.compareTo(y));

        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
