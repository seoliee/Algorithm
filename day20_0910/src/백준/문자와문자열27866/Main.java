package 백준.문자와문자열27866;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int i = sc.nextInt();
		
		// S의 i번째 글자 출력...
		System.out.println(S.charAt(i - 1));
		
	}
}
