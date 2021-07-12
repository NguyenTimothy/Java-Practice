import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal intInvest;
        BigDecimal interest;
        int years;
        BigDecimal deposit;
        BigDecimal finalValue;
        BigDecimal gains;
        String string;
        Scanner scan = new Scanner(System.in);

        System.out.println("How much would you like to invest?");
        string = scan.next();
        intInvest = new BigDecimal(string);
        finalValue = intInvest;
        System.out.println("How much more will you deposit every year?");
        string = scan.next();
        deposit = new BigDecimal(string);
        System.out.println("What is your expected yearly interest rate (%)?");
        string = scan.next();
        interest = new BigDecimal(string);
        interest = (interest.divide(new BigDecimal(100))).add(new BigDecimal(1));
        System.out.println("How many years will you grow this investment?");
        years = Integer.parseInt(scan.next());

        for(int i = 0; years - i > 0; i++){
            finalValue = finalValue.multiply(interest);
            finalValue = finalValue.add(deposit);
        }
        finalValue = finalValue.setScale(2, RoundingMode.HALF_EVEN);
        gains = (finalValue.subtract(intInvest)).subtract(deposit.multiply(new BigDecimal(years)));
        System.out.println("You started with " + intInvest + " and ended with " + finalValue +
                " after " + years + " years.\nTotal interest earned: " + gains);
    }
}
