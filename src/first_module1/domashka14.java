package first_module1;

import java.util.Scanner;

public class domashka14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        double vo = 0.05;
        int vi = (v * 5000);
        int v2 = (int) (vi * vo);
        System.out.println(v2);
    }
}
