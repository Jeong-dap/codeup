import java.util.Scanner;
public class Codeup_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.replaceAll("-", "");
        System.out.println(a);
    }
}
