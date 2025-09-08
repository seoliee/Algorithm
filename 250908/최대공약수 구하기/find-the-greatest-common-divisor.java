import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        yak(n, m);
    }

    public static void yak(int n, int m) {
        int num = 1;
        if(n < m) {
            num = n;
        } else
        num = m;

        while(true) {
            if(n % num == 0 && m % num == 0) {
                System.out.println(num);
                break;
            }
            num--;
        }
    }
}