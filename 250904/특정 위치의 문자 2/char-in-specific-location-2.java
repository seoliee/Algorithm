import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자 10개 입력받음
        // 2번째, 5번째, 8번째 입력받은 문자 출력
        // 인덱스로는 1, 4, 7
        String[] arr = new String[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        System.out.print(arr[1] + " ");
        System.out.print(arr[4] + " ");
        System.out.print(arr[7] + " ");
    }
}