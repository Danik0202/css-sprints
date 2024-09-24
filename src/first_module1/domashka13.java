package first_module1;

import java.util.Scanner;

public class domashka13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        System.out.println((v%3)*10+(v/10));
    }
}
