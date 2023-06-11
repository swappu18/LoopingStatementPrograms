import java.util.Scanner;

public class assignment15PrimeFactorNumber {
    public static void main(String[] args) {
        System.out.println("enter the limit of number");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int divider=0;
        for(int i=2;i<=number;i++)
        {
            while(number%i==0)
            {
                System.out.println(i);
                number/=i;
            }

        }
        if(number>2)
        {
            System.out.println(number);
        }


    }
}
