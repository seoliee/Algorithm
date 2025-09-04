import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수는 최대 100개 주어짐 => 몇 개 나올지 몰라
        // 하나씩 입력 받다가
        // 입력받은 애가 0이면 그거의 인덱스 = i
        // i-1, i-2, i-3 더해서 출력하셈

        List<Integer> arr = new ArrayList<>();
        
        int i = 0;
        int num;

        while((num = sc.nextInt()) != 0) {
            arr.add(num);
            i++;
        }
        
        int sum = 0;
        sum = arr.get(i-1) + arr.get(i-2) + arr.get(i-3);

        System.out.println(sum);


    }
}