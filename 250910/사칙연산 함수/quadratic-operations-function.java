import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        cal(a, o, c);
    }

    public static void cal(int a, char o, int c) {
        int ans;

        if(o == '+') {
            ans = a + c;
            System.out.printf("%d + %d = %d", a, c, ans);    
        } else if(o == '-') {
            ans = a - c;
            System.out.printf("%d - %d = %d", a, c, ans);    
        } else if(o == '/') {
            ans = a / c;
            System.out.printf("%d / %d = %d", a, c, ans);    
        } else if(o == '*') {
            ans = a * c;
            System.out.printf("%d * %d = %d", a, c, ans);    
        } else {
            System.out.println("False");
        }
    }
}