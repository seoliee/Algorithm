package SWEA.부분수열의합2817;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/부분수열의합2817/input.txt");
		Scanner sc = new Scanner(file);
		
		// 테스트케이스 개수 입력받기
		int T = sc.nextInt();
		
		// 테스트케이스 개수만큼 반복 시작
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();  // 숫자 개수
			int K = sc.nextInt();  // 부분수열의 합
			int[] arr = new int[N];
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int cnt = 0;
			for(int i = 0; i < (1 << N); i++) {
				int sum = 0;
				for(int j = 0; j < N; j++) {
					if((i & (1 << j)) != 0) {
						sum += arr[j];
					}
				}
				if(sum == K) 
					cnt++;
			}
			
			System.out.println("#" + tc + " " + cnt);
		}  // 테케만큼 반복 끝

		
	}

}
