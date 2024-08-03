import java.util.Scanner;
public class Codeup_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();       // 실수 입력
        System.out.printf("%.2f", a);   // 소수점 두번째 자리까지 반올림 하여 출력
    }
}
