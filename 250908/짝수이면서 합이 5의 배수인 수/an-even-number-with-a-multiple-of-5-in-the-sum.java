import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        isTrue(n);

    }

    public static void isTrue(int n) {
        int a = n / 10;
        int b = n - a * 10;
        if(n % 2 == 0 && (a + b) % 5 == 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}