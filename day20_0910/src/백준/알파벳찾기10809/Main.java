package 백준.알파벳찾기10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 'a' = 97
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.next();
		char[] inpArr = inp.toCharArray();
		int len = inpArr.length;
		
		int[] alphabet = new int[26];
		
		for(int i = 0; i < 26; i++) {
			alphabet[i] = -1;
		}
		
		for(int i = 0; i < len; i++) {
			if(alphabet[inpArr[i]-97] == -1)
				alphabet[inpArr[i] - 97] = i;
			else if(alphabet[inpArr[i]-97] < i) {
				continue;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
	}
}
