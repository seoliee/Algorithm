import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        square(N);
        
    }

    static int num = 1;
    public static void square(int N) {
        // 1 2 3 4 5 6 7 8 9
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(num + " ");
                num++;
                if(num == 10) {
                    num = 1;
                }
            }
            System.out.println("");
        }
    }
}