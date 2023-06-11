import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number =");
        int number = scanner.nextInt();
        int reversed=0;
        if(number>0)
        {
            int lastDigit=number%10;
            reversed=reversed%10 +lastDigit;
            number=number/10;

            int secondDigit=number%10;
            reversed=reversed%10 +secondDigit;
            number=number/10;

            int firstDigit=number%10;
            reversed=reversed%10 +firstDigit;
            number=number/10;

            System.out.println("reversed number=" +reversed);
        }

    }
}
