package first_module12;

import java.util.Scanner;

public class new8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a <= 2019){
            System.out.println("NO");
        } else if (a >= 2021) {
            System.out.println("YES");
            
        } else if (a == 2020){
            System.out.println("ERROR");
        }
    }
}
