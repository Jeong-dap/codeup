import java.util.Scanner;
public class Codeup_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();

        int o = Integer.valueOf(i, 8);

        System.out.printf("%d", o);
    }
}
