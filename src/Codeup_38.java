import java.util.Scanner;
public class Codeup_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String [] data = s.split(" ");

        long x = Long.valueOf(data[0]);
        long y = Long.valueOf(data[1]);

        System.out.println(x + y);
    }
}
