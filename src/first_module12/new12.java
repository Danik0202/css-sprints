package first_module12;

import java.util.Scanner;

public class new12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a <= 100 || a >=200){
            System.out.println("YES");
        } else if (a != 100 || a != 200) {
            System.out.println("NO");
        }
    }
}
