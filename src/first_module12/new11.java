package first_module12;

import java.util.Scanner;

public class new11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        int min = a;
        if(max < b){
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if(min > b){
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println(min);
    }
}
