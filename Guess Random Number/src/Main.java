import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 1001);
        System.out.println("Guess a number between 0-1000");
        while (true) {
            int guess = Integer.parseInt(scan.next());
            if (guess > num){
                System.out.println("Choice: " + guess + "\nWrong. Smaller!");
            } else if (num > guess){
                System.out.println("Choice: " + guess + "\nWrong. Bigger!");
            } else {
                System.out.println("Choice: " + guess + "\nCorrect! The number was " + num + ".");
                break;
            }
        }
    }
}
