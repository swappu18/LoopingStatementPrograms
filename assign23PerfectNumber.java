import java.util.Scanner;

public class assign23PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the startRange and endRange");
        Scanner scanner = new Scanner(System.in);
        int startRange=1;
        int endRange=1000;
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) {
                System.out.println("Factor=" + i);
                sum += i;
            }


        System.out.println("num=" + num);
        System.out.println("sumOfItsFactor=" + sum);
        System.out.println(sum == num ? "it is perfect num" : "its not a perfect num");

    }
}

