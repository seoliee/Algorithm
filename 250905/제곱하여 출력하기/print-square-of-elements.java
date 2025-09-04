import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 원소의 개수
        int N = sc.nextInt();

        int[] arr = new int[N];
        // N개의 원소가 공백을 사이에 두고 주어짐
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i]*arr[i] + " ");
        }
    }
}