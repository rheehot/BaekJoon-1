import java.util.Scanner;

public class Main {
    public static void main(String argc[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a/b);
        sc.close();
    }
}