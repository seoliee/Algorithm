import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(power(a, b));
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}