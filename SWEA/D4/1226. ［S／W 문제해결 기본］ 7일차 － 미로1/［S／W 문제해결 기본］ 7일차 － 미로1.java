
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int start_r, start_c;
	static int[][] maze;  // 미로
	static boolean[][] visited;  // 방문체크
	static boolean ans;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws FileNotFoundException {
		// 도착점까지 가는 길이 있나연
		// 미로는 DFS로 풀어라?
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스 총 10개
		// 10번 반복 (테케 10개)
		for(int tc = 1; tc <= 10; tc++) {
			
			int T = sc.nextInt();  // 테케 입력 받기
			
			// 미로 입력받기
			maze = new int[16][16];
			// visited 배열 초기화
			visited = new boolean[16][16];
			// ans 초기화
			ans = false;
			
			// 시작 좌표 설정
			start_r = 0;
			start_c = 0;
			
			// 공백 없이 한 줄로 주어짐 => 한 줄 String으로 입력 받아
			for(int r = 0; r < 16; r++) {
				String s = sc.next();
				for(int c = 0; c < 16; c++) {
					maze[r][c] = s.charAt(c) - '0';
					
					// maze[r][c] == 2인 좌표에서 시작
					// 시작 좌표 먼저 찾아
					
					// 시작점 저장
					if(maze[r][c] == 2) {  // 값이 2인 지점 = 시작점
						start_r = r;
						start_c = c;
					}
				}
			}
			
			bfs(start_r, start_c);
			
			if(ans)
				System.out.println("#" + tc + " 1");
			else
				System.out.println("#" + tc + " 0");
			
			
		}  // 테스트케이스만큼 반복 끝
		
	}
	
	static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();		
		
		// 시작점 큐에 넣기
		q.add(new int[] {r, c});
		
		// 큐가 비어있지 않은 동안 반복문 돌려
		while(!q.isEmpty()) {
			int[] curr = q.poll();  // 맨 앞의 좌표 꺼내
			
			// 이 좌표를 꺼냈을 때 도착지점인 경우
			if(maze[curr[0]][curr[1]] == 3) {
				ans = true;
				return;
			}
			
			// 도착지점 아니면 계속 탐색해
			for(int i = 0; i < 4; i++) {
				int new_r = curr[0] + dr[i];
				int new_c = curr[1] + dc[i];
				
				// 1. 범위 벗어났는지 체크
				if(new_r < 0 || new_c < 0 || new_r >= 16 || new_c >= 16)
					continue;
				
				// 2. 벽인지 체크
				if(maze[new_r][new_c] == 1)
					continue;
				
				// 3. 이미 방문했는지 체크
				if(visited[new_r][new_c] == true)
					continue;
				
				// 만약 위 조건에 모두 해당 안된다면
				visited[new_r][new_c] = true;  // 큐에 넣기 전 방문처리
				q.add(new int[] {new_r, new_c});  // 큐에 새 좌표 넣고
			}
		}
		
	}

}
