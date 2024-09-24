package first_moduledom2;

import java.util.Scanner;

public class new5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int s = 1;
        while (true){
            if (a == 0){
                break;
            }else if (a%2 == 0){
                s *= a;
            }
            a = in.nextInt();
        }
        System.out.println(a);
    }
}
