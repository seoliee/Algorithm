import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        if(a < b && a < c) {
            return a;
        } else if(b < a && b < c) {
            return b;
        } else
            return c;
    }
}