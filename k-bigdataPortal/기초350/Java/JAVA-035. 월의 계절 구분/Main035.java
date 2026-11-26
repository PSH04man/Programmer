import java.util.*;
public class Main035{
    public static void main(String[] args){
        Scanner sc = new Scanenr(System.in);
        int a = sc.nextInt();
        String [] season = {"WINTER", "SPRING", "SUMMER", "FALL"};
        System.out.print(season[(a % 12) / 3]);
        sc.close();
    }
}