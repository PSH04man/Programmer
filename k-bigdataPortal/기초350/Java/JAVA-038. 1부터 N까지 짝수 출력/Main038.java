import java.util.*;
public class Main038{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++ ){
            if ( i % 2 != 0 || i == 0) {
                continue;
            }
        System.out.print(i + " ");
        }
        
        sc.close();
    }
}