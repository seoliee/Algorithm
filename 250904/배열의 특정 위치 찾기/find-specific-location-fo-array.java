import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 짝수번째로 입력된 값의 합
        // 인덱스가 홀수
        int evenSum = 0;
        for(int i = 1; i < 10; i+=2) {
            evenSum += arr[i];
        }
        // 3의 배수번째로 입력된 값의 평균
        // 그러면 인덱스가 2부터 3씩 증가
        int sum = 0;
        int cnt = 0;
        for(int i = 2; i < 10; i+=3) {
            sum += arr[i];
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.1f", evenSum, avg);
    }
}