package 백준.이항계수1_11050;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int top = 1;
		int bottom = 1;
		
		for(int i = N; i > N - K; i--) {
			top *= i;
		}
		
		for(int i = K; i > 0; i--) {
			bottom *= i;
		}
		
		int result = top / bottom;
		
		System.out.println(result);
	}
}
