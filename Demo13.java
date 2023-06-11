import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println("enter numerator and denominator");
        Scanner scanner = new Scanner(System.in);
        int numerator=scanner.nextInt();
        int denominator=scanner.nextInt();
        int quotient=0;
        {
            for(;numerator>0 && numerator>=denominator;)
            {
                numerator=numerator-denominator;
                quotient++;
            }
            System.out.println("quotient is"+quotient);
            System.out.println("remainder is"+numerator);

        }
    }
}
