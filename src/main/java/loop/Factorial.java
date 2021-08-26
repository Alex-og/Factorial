package loop;

import java.util.stream.IntStream;

public class Factorial {
    public int fact(int n) {
        return n <= 1 ? 1 : IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    }
}
