import java.util.*(<- 이건 거의 외웠어요 으하하)
public class Java021{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Math.abs(n);
        
            if (result % 2 == 0) {
                System.out.print("EVEN");
            } else {
                System.out.print("ODD");
            }
            sc.close();
    }
}