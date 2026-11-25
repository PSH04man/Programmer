public class Main027{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    
        boolean match = a % 3 == 0;
        System.out.println(match? "YES" : "NO");
        sc.close();
    }
}