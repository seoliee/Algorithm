package SWEA.활주로건설4014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/활주로건설4014/input.txt");
		Scanner sc = new Scanner(file);

		// 테스트케이스 입력받기
		int T = sc.nextInt();

		// 테스트케이스만큼 반복 시작
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 지도 한 변의 크기
			int X = sc.nextInt(); // 경사로의 길이
			int[][] map = new int[N][N]; // 지도의 배열

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			} // 배열 입력받기 끝

			// 한 줄의 높이가 모두 같은 경우 검사
			int roadCnt = 0;
			boolean isSame = false;

			// 하나의 row의 높이가 모두 같은 경우
			for (int r = 0; r < N; r++) {
				for (int c = 1; c < N; c++) {
					if (map[r][c] != map[r][c - 1]) {
						isSame = false;
						break;
					} else {
						isSame = true;
					}
				}
				if (isSame)
					roadCnt++;
			}

			// 하나의 column의 높이가 모두 같은 경우
			for (int c = 0; c < N; c++) {
				for (int r = 1; r < N; r++) {
					if (map[r][c] != map[r - 1][c]) {
						isSame = false;
						break;
					} else {
						isSame = true;
					}
				}
				if (isSame)
					roadCnt++;
			}

			// 경사로 만들 수 있는 경우
			// 가로 경사로
			
			// 방문했는지 표시하는 배열 (한 줄 검사하고 초기화해야 함)
			boolean[] visited = new boolean[N];
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c<N; c++) {
					
					int current = map[r][c];
					int next = map[r][c+1];
					
					// 높이가 1 이상 차이나면 활주로 건설 불가
					if(Math.abs(current - next) > 1) {
						visited[c] = true;  // 방문 표시
					}
					
					else if(current - next > 0) {
						for(int i = 0;i<X;i++) {
							int nextIdx = c + i + 1;
							if(nextIdx >= N || map[r][nextIdx] != next || visited[nextIdx]) {
								// 경사로 안돼
							}
						}
					}
					
				}
			}

			System.out.println("#" + tc + " " + roadCnt);
		} // 테스트케이스만큼 반복 끝

	}

}
