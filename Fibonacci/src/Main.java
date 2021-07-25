public class Main {

    static int fibonacci(int num) {
        int[] fib = new int[num + 2];
        fib[1] = 1;
        for (int i = 2; i <= num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
            return fib[num];

    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(fibonacci(i));
        }
    }
}