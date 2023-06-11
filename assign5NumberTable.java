import java.util.Scanner;

public class assign5NumberTable {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
         for(int i=1;i<=10;i++)
        {
            System.out.println(i*num1);

        }
    }
}
