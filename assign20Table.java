import java.util.Scanner;

public class assign20Table {
    public static void main(String[] args) {
        System.out.println("Enter positive integer number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*num);
        }

    }
}
