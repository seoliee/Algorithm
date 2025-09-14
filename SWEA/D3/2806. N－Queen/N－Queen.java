

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int[][] board;  // 체스판
	static int cnt;  // 배치 가능한 경우
	static int N;  // 퀸 개수
	
	static int[] dr = {-1, -1, -1};
	static int[] dc = {-1, 0, 1};
	// 행을 위 -> 아래로 이동하면서 퀸 배치
	// 현재 행에 퀸 놓을 때 이미 놓여있는 퀸은 항상 위쪽 행에만 존재 => 위쪽으로만 충돌 검사 해도 충분
			
			
	public static void main(String[] args) throws FileNotFoundException {
		// dfs로 풀어라
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스의 수
		int T = sc.nextInt();
		
		// 테스트케이스만큼 입력 받기
		for(int tc = 1; tc <= T; tc++) {
			// 퀸 개수 입력받기
			N = sc.nextInt();
			
			cnt = 0;
			
			// 체스판 (8*8)
			board = new int[N][N];
			
			nQueen(0);
			
			System.out.println("#" + tc + " " + cnt);
			
			
			
			// 서로 다른 두 퀸이 공격하지 못하게 놓는 경우의 수?
			// row, column 같으면 안되고 
		}  // 테스트케이스만큼 입력 완료

	}

	// row 하나씩 순회하면서 검사
	static void nQueen(int row) {
		// 놓을 수 있는 자리 찾음 (종료 조건)
		if(row == N) {
			cnt++;
			return;
		}
		
		for(int c = 0; c < N; c++) {
			if(isValid(row, c)) {
				board[row][c] = 1;  // 방문 체크
				nQueen(row+1);  // 다음 행으로 이동
				board[row][c] = 0;  // 원상복구
			}
		}
	}
	
	// 자리에 놓을 수 있는지 유효성 검사 메서드
	static boolean isValid(int row, int col) {
		boolean result = true;  // 결과 true로 초기화
		
		for(int d = 0; d < 3; d++) {
			if(!result) break;  // 결과가 false면 탐색 종료
			
			// 다음 탐색할 좌표
			int nextR = row + dr[d];
			int nextC = col + dc[d];
			
			while(isInBound(nextR, nextC)) {  // 다음 탐색할 좌표가 체스판 안에 있으면
				if(board[nextR][nextC] == 0) {  // 만약 다음 좌표에 퀸이 없는 경우
					nextR += dr[d];  
					nextC += dc[d];  // 다음 좌표로 이동
				} else {
					result = false;
					break;
				}
			}
		}
		
		return result;
	}
	
	// 해당 좌표가 체스판 안에 있는지 검사하는 메서드
	static boolean isInBound(int row, int col) {
		return row >= 0 && col >= 0 && row < N && col < N;
	}
}
