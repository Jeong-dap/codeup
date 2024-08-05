import java.util.Scanner;
public class Codeup_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        int num = Integer.parseInt(s1, 16);

        String s2 = Integer.toOctalString(num);

        System.out.println(s2);
    }
}
