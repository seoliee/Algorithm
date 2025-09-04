import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            if(arr[i] >= 250) {
                double avg = (double)sum / cnt;
                double roundedAvg = Math.round(avg * 10.0) / 10.0;
                
                System.out.println(sum + " " + roundedAvg);
                break;
            }
            sum += arr[i];
            cnt++;
        }
    }
}