package first_module1;

import java.util.Scanner;

public class domashka15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println(s%10);
        System.out.println(s%100/10);

    }
}
