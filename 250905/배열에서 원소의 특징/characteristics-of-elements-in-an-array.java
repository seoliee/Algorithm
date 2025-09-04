import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원소 10개 주어짐
        // 3의 배수가 처음으로 등장하는 부분의 바로 앞 원소 출력
        
        // 입력 받아
        // 3의 원소인지 확인해
        // 아니면 넘어가

        // 입력 받아
        // 3의 원소인지 확인해
        // 앞의 원소 출력해

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while(arr[i] % 3 != 0) {
            i++;
        }
        System.out.println(arr[i-1]);
    }
}