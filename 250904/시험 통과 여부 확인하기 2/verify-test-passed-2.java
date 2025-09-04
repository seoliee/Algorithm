import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] testResult = new int[4];

        int avg = 0;
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                testResult[i] = sc.nextInt();
                sum += testResult[j];
            }  // 학생 하나의 시험결과 배열, 합 받음

            avg = sum / 4;
            if(avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);

    }
}