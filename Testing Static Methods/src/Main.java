public class Main {
    static double absValue(double num){
        if (num < 0) {
            num = -num;
        }
        return num;
    }
    static double squareRoot(double num){
        double low = 0;
        double high = num;
        double mid = (high + low)/2;
        while (!(mid * mid - num == 0)) {
            mid = (high + low) / 2;
            if (mid * mid > num) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return mid;
    }
    static double pyth(double a, double b){
        return squareRoot(a*a + b*b);
    }

    public static void main(String[] args) {
        System.out.println(absValue(-5));
        System.out.println(squareRoot(25));
        System.out.println(pyth(4, 3));
    }
}
