package first_module12;

import java.util.Scanner;

public class new13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a%3 == 0 || a%5 == 0){
            System.out.println("YES");
        } else if (a%3 == 1 || a%3 == 2) {
            System.out.println("NO");
        }
    }
}
