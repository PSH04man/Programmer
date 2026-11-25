import java.util.Scanner;

public class RightTriangleDrawer {
    public static void main(String[] args) {

        System.out.print("is what n? : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}