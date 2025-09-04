import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 10개 입력받음
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 인덱스가 짝수인 정수의 합
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                evenSum += arr[i];
        // 인덱스가 홀수인 정수의 합
            } else {
                oddSum += arr[i];
            }
        }

        // 뺀 수의 절대값 출력
        int result = Math.abs(evenSum - oddSum);
        System.out.println(result);
    }
}