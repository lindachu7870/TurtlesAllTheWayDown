// https://introcs.cs.princeton.edu/java/23recursion/

public class Recursion {
    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}

