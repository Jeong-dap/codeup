import java.util.Scanner;
public class Codeup_26 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        String [] sr = s.split(":");

        // 시 분 초에서 분만 출력
        System.out.println(Integer.valueOf(sr[1])); // 시를 출력하려면 sr[0], 초를 출력하려면 [2]
    }
}
