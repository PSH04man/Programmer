public class Main020{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double seop = sc.nextInt();
        double hwa = (seop * 1.8) + 32;
        System.out.print("%1.f",hwa);
        sc.close();

    }
}