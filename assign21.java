import java.util.Scanner;

public class assign21 {
    public static void main(String[] args) {
        int n,sum=0,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want sum");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the "+n+" numbers ");
        while(i<n)
        {
            System.out.println("Enter  number  "+(i+1)+":");
            a[i]=sc.nextInt();
            sum+=a[i];
            i++;
        }
        System.out.println("sum is ="+sum);
    }
}
