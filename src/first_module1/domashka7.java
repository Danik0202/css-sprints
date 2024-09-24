package first_module1;

import java.util.Scanner;

public class domashka7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println((a * b * c) + " " + 2*(a*b + b*c + a*c));


    }
}
