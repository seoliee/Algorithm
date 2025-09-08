import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(sumResult(n));
    }

    public static int sumResult(int n) {
        int result = 0;
        for(int i = n; i >= 1; i--) {
            result += i;
        }

        int answer = result / 10;
        return answer;
    }
}