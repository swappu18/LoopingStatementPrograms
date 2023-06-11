import java.util.Scanner;

public class assign12SumOfDigits {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int sumOfDigits=0;
        while(num1>0)
        {
            int lastDigits=num1%10;
            sumOfDigits+=lastDigits;
            num1=num1/10;

        }
        System.out.println("sum of Digits"+sumOfDigits);

    }
}
