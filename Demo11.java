import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        System.out.println("enter three number");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*number);
        }

    }
}
