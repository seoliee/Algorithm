import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;
        for(int i = A; i <= B; i++) {
            if(has369(i) || i % 3 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean has369(int n) {
        while(n > 0) {
            if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}