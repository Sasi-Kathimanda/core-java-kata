import java.util.Arrays;
import java.util.List;

/**
 * Created by sasi-kathimanda on 18/12/16.
 */
public class FunctionComposition {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Given number, double the even number and add total

        //IMPERATIVE STYLE
        int result = 0;
        for (int e : numbers) {
            if (e % 2 == 0) {
                result += e * 2;
            }
        }
        System.out.println(result);

        //FUNCTIONAL STYLE
        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .reduce(0, Integer::sum)
        );
    }
}
