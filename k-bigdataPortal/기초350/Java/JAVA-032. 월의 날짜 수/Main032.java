import java.util.*;

public class Main032{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if ( x == 2){
            System.out.print("28");
        }
        else if ( x <= 7 ){
            if (x % 2 == 0){
                System.out.print("30");
            } else  {
                System.out.print("31");
            }
        } 
        else if (x >= 8) {
            if( x % 2 == 0){
                System.out.print("31");
            } else {
                System.out.print("30");
            }
        }
        sc.close();
    }
}