import java.util.*;
public class Main024{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt(); //i값
        int j = sc.nextInt(); //j값
        
        if(i >= j){ 
            System.out.println(i); //i 값이 더 높으면 i값 프린트
        }else{
            System.out.println(j);//j값이 더 높으면 j값 프린트
        }
        sc.close();
    }
}