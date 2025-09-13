package 백준.숫자의합11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String inp = sc.next();
		
		// N개의 숫자를 모두 합해서 출력해라...
		// inp은 String
		char[] arr = inp.toCharArray();
		
		int result = 0;
		
		// 이 원소를 하나씩 나눠서 더해
		for(int i = 0; i < N; i++) {
			result += arr[i] - '0';
		}
		
		System.out.println(result);
	}
}
