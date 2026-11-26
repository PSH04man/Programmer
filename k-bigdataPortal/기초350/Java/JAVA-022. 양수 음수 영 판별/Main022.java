import java.util.*;
public class Main022{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0){
            System.out.print("POSITIVE");
        } else if (n < 0) { // 사실 else if 몰랐는데(까먹었는데) 배웠습니다?
            System.out.print("NEGATIVE");
        } else {
            System.out.print("ZERO");
        }
        
        sc.close();
        
    }
}