package first_module12;

import java.util.Scanner;

public class new10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b || a == c){
            System.out.println("YES");
        }
        if (a != b){
            System.out.println("NO");
        }
    }
}
