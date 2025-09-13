package SWEA.벽돌깨기5656;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/벽돌깨기5656/input.txt");
		Scanner sc = new Scanner(file);
		
		// 테스트케이스 입력받기
		int T = sc.nextInt();
		
		// 테스트케이스만큼 반복 시작
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();  // 구슬 던지는 횟수
			int W = sc.nextInt();  // 가로 길이
			int H = sc.nextInt();  // 세로 길이
			
			int[][] arr = new int[W][H];
			for(int r = 0; r < W; r++) {
				for(int c = 0; c < H; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			
		}  // 테스트케이스만큼 반복 끝
		
	}

}