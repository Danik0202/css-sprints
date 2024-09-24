package first_module12;

import java.util.Scanner;

public class new15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a - 100 == 100 || b - 100 == 100){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
