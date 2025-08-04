import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// input.txt 파일 내용 받아오기
//		File file = new File("./src/day01_0804/SWEA/최대수_구하기2068/input.txt");
//		Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
		
		// 첫째 줄에 있는 테스트케이스 개수
		int T = sc.nextInt();
		
		// 테스트케이스를 한 줄씩 T번 받아옴
		for(int i = 0; i < T; i++) {
			// 받아온 정수를 저장할 배열 (각 줄마다 입력되는 정수는 10개)
			int arr[] = new int[10];
			// 한 줄에 입력받은 정수를 하나씩 순회하며 새로운 배열 arr에 추가
			for(int j = 0; j < 10; j++) {
				arr[j] = sc.nextInt();
			}
			// 정렬
			Arrays.sort(arr);
			System.out.println("#" + (i + 1) + " " + arr[9]);
		}
		
	}

}
