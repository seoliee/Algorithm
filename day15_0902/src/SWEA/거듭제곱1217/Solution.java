package SWEA.거듭제곱1217;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/거듭제곱1217/input.txt");
		Scanner sc = new Scanner(file);

		// 테스트케이스 10개 => 10번 반복
		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();

			int answer = pow(N, M);

			System.out.println("#" + T + " " + answer);

		} // 10번 반복 끝

	}

	static int result = 1;

	public static int pow(int N, int M) {
		if (M == 0) {
			result = 1;
			return 1;
		} else {
			result = N * pow(N, M - 1);
			return N * pow(N, M - 1);
		}
	}
}
