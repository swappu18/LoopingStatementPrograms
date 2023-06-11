import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        System.out.println("enter the range");
        Scanner scanner = new Scanner(System.in);
        int startRange=scanner.nextInt();


        int endRange =scanner.nextInt();


        for (int i = startRange; i <= endRange; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }
    }
}
