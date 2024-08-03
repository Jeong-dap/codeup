import java.util.Scanner;
import java.util.StringTokenizer;
public class Codeup_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();   // 문자열 입력
        StringTokenizer st = new StringTokenizer(time, ":");    // time을 : 을 경계로 입력받기
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i <= st.countTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(arr[0] + ":" + arr[1]);
    }
}