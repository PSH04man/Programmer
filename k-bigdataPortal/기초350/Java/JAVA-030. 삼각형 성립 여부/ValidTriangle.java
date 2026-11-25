import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean what = (a + b > c) && (b + c > a) && (a + c > b);
        System.out.print(what ? "YES" : "NO");
        sc.close();
    }
}