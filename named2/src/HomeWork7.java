
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeWork7 {


    public boolean is_identical(String one, String two) {    // 1
        return one.equals(two);
    }

    public static void main(String[] args) {
        // 2
        int maxValue = 100; // Максимальное число в массиве
        int quantity = 100; // Количество чисел в массиве
        int[] array = IntStream.generate(() -> new Random().nextInt(maxValue)).limit(quantity).toArray();
        System.out.println(IntStream.of(array)
                .filter(i -> (i & 1) == 1)
                .mapToObj(Integer::toString)
                .count());

        // 3
        String[] words = new String[]{"apple", "banana", "car", "door", "chair"};
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();

        System.out.println(Arrays.stream(words)
                .filter(i -> i.startsWith(symbol))
                .collect(Collectors.joining(", ")));
    }
}