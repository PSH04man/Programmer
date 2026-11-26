import java.util.*;
public class Main033{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        
        System.out.print(a >= 10000 ? a - (a / 10) : a);
        sc.close();
    }
}