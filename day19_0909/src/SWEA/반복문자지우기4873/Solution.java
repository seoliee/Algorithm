package SWEA.반복문자지우기4873;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/반복문자지우기4873/input.txt");
		Scanner sc = new Scanner(file);
		
		// 테스트케이스
		int T = sc.nextInt();
		
		// 테스트케이스만큼 반복 시작
		for(int tc = 1; tc <= T; tc++) {
			// 주어진 문자 String으로 입력 받음
			String input = sc.next();
			// 남은 문자 배열
			char[] result = new char[input.length()];
			// result의 마지막 값
			int top = -1;  // 처음에는 비었으므로 -1로 설정
			
			// input의 글자를 char 배열로 나눠서 하나씩 순회
			for(char ch : input.toCharArray()) {
				if(top >= 0 && ch == result[top]) {  // result 배열이 비어있지 않고, 현재 글자가 result의 가장 위에 있는 값과 같은 경우
					top--;
				} else {
					top++;
					result[top] = ch;  // result 배열의 가장 위에 현재 글자인 ch 추가
				}
			}
			
			System.out.println("#" + tc + " " + (top+1));
			
		}  // 테스트케이스만큼 반복 끝
	}

}
