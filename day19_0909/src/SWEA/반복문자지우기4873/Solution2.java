package SWEA.반복문자지우기4873;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/반복문자지우기4873/input.txt");
		Scanner sc = new Scanner(file);
		
		// 테스트케이스
		int T = sc.nextInt();
		
		// 테스트케이스만큼 반복
		for(int tc = 1; tc <= T; tc++) {
			
			// 주어진 문자열 입력받기
			String input = sc.next();
			// 결과 배열
			char[] result = new char[input.length()];
			// result 배열의 맨 위에 있는 글자
			int top = -1;
			
			for(char ch : input.toCharArray()) {
				if(top >= 0 && ch == result[top]) {  // result 배열이 비어있지 않고 result 배열의 맨 위에 있는 문자와 입력받은 다음 문자가 같을 때
					top--;  // result 배열 내에 있는 중복되는 글자 삭제
				} else {
					top++;
					result[top] = ch;  // 다음 글자 result 배열에 추가
				}
			}
			
			System.out.println("#" + tc + " " + (top+1));
			
			
		}  // 테스트케이스만큼 반복 끝
	}
}
