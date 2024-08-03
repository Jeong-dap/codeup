import java.util.Scanner;
public class Codeup_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       // 정수 입력
        for (int i = 0; i < 3; i++) {   // for (선언; 범위; 증감)
            System.out.printf("%d ", a);    // 같은 문자가 출력이 되는데 공백을 한칸씩 삽입하여 출력
        }
    }
}

