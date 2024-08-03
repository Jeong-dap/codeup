import java.util.Scanner;
public class Codeup_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[i] = s.charAt(i) - '0';
        }
        System.out.println("[" + ans[0] * 10000+"]");
        System.out.println("[" + ans[1] * 1000+"]");
        System.out.println("[" + ans[2] * 100+"]");
        System.out.println("[" + ans[3] * 10+"]");
        System.out.println("[" + ans[4] + "]");
    }
}
