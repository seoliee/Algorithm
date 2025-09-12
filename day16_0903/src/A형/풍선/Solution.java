package A형.풍선;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static List<Integer> balloons;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/A형/풍선/input.txt");
		Scanner sc = new Scanner(file);

		// 테스트케이스 입력받기
		int T = sc.nextInt();
		// 테스트케이스 크기만큼 반복 시작
		for(int tc = 1; tc<=T; tc++) {
			// 풍선 개수 입력받기
			int N = sc.nextInt();
			// 풍선 배열 생성
			balloons = new ArrayList<>();
			// 풍선 배열 입력받기
			for(int i = 0; i < N; i++) {
				balloons.add(sc.nextInt());
			}
			
			System.out.println(balloons);
			
		}  // 테스트케이스 크기만큼 반복 끝
	}
	
	
	
}
