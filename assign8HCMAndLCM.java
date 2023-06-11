import java.util.Scanner;

public class assign8HCMAndLCM {
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int HCF=1;
        for(int i=1;i<=num1&&i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0){

            }
        }
        System.out.println("HCF of "+num1+"and"+num2+"is"+HCF);

    }
}
