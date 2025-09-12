package 백준.문자열9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			String inp = sc.next();
			int len = inp.length();
			
			String first = String.valueOf(inp.charAt(0));
			String last = String.valueOf(inp.charAt(len - 1));
			
			System.out.println(first + last);
		}
		
	}
}
