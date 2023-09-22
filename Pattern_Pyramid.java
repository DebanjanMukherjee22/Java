import java.util.Scanner;

public class Pattern_Pyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("a is " + a);
        int d = -1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int t = 1; t <= i; t++)
            {
                System.out.print(a + " ");
                a--;
            }
            System.out.println(" ");
        }
    }
}
