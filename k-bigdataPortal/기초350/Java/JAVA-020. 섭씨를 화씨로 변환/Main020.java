import java.util.*;
public class Main020{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double seop = sc.nextInt();
        double hwa = (seop * 1.8) + 32;
        System.out.printf("%.1f", hwa);
        sc.close();

    }
}