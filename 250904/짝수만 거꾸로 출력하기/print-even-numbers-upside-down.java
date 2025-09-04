import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        List<Integer> evenNum = new ArrayList<>();

        // N회 반복문 돌면서 크기 N인 배열에 정수 입력받음
        for(int i = 0; i < N; i++) {
            arr[i]= sc.nextInt();
            if(arr[i] % 2 == 0) {
                evenNum.add(arr[i]);
            }
        }

        for(int i = evenNum.size() - 1; i >= 0; i--) {
            System.out.print(evenNum.get(i) + " ");
        }
        // 하나 입력 받고 그거 짝수인지 확인
        // ArrayList 하나 선언하고 거기에 짝수만 저장할거야
        // 짝수면 넣고, 아니면 넘어가
        // 그래서 그 ArrayList 거꾸로 출력해

    }
}