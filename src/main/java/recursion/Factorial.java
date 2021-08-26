package recursion;

public class Factorial {
    public int fact(int n) {
        return n <= 1 ? 1 : fact(n - 1) * n;
    }
}
