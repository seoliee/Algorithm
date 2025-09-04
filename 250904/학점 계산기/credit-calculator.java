import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double sum = 0.0;

        double[] score = new double[N];
        for(int i = 0; i < N; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }

        double avg = sum / N * 10.0;
        double roundedAvg = Math.round(avg) / 10.0;
        String result = "";

        if(roundedAvg >= 4.0) {
            result = "Perfect";
        } else if(roundedAvg >= 3.0) {
            result = "Good";
        } else {
            result = "Poor";
        }

        System.out.printf("%.1f\n", roundedAvg);
        System.out.println(result);
        
    }
}