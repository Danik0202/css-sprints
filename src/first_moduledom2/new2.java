package first_moduledom2;

import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(max < a){
            max = a;
        }
        if(min > a){
            min = a;
        }
        if (max < b){
            max = b;
        }
        if (min > b){
            min = b;
        }

        if (a < b){
            System.out.println("1");
        } else if (a > b) {
            System.out.println("2");

        }

    }
}
