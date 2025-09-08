import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        bae(n, m);
    }

    static void bae(int n, int m) {
        int num;
        if(n > m) {
            num = n;
        } else {
            num = m;
        }

        while(true) {
            if(num % n == 0 && num % m == 0) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}