import java.util.Scanner;
public class Codeup_27 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        String [] sr = s.split("\\.");

        System.out.println(sr[2] + "-" + sr[1] + "-" + sr[0]);
    }
}
