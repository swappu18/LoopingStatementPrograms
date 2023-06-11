import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i<=number/2; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
            System.out.println(isPrime ? "Prime" : "not a prime");


        }


    }
}
