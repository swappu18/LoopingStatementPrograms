import java.util.Scanner;

public class assign19a {
    public static void main(String[] args) {
        System.out.println("enter the first ten natural numbers");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=scanner.nextInt();
        for(int i=1;i<=num;i++)
            sum+=i;

        {
            System.out.println("sum is="+sum);

        }

    }
}
