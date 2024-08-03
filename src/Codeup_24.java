import java.util.Scanner;
public class Codeup_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char list[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            list[i] = s.charAt(i);
        }
        for (char i:list) {
            System.out.println("'" + i + "'");
        }
    }
}