public class Pro1_64010965 {
    public static void main(String[] args) {
        int n = 1, b = 1, value = 2;
        while (n <= 100) {
            if (prime(value) == 1 && palindrome(value) == 1) {
                if (b < 10) {
                    System.out.printf("%d ", value);
                } else if (b == 10) {
                    System.out.printf("%d\n", value);
                    b = 0;
                }
                ++n;
                ++b;
            }
            ++value;
        }
    }

    public static int prime(int a) {
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int palindrome(int n) {
        if (n % 10 == 0)
            return 0;
        int r = 0;
        while (r < n) {
            r = 10 * r + n % 10;
            n /= 10;
        }
        while (n == r || n == r / 10)
            return 1;
        return 0;
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}
