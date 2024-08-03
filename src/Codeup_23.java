import java.util.Scanner;
public class Codeup_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String list[] = s.split("[.]");

        System.out.println(list[0]);
        System.out.println(list[1]);
    }
}
