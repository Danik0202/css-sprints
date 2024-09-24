package first_moduledom2;

import java.util.Scanner;

public class new4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = a;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + i * a);
        }
    }
}
