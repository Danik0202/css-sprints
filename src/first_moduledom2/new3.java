package first_moduledom2;

import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

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
        if (max < c){
            max = c;
        }
        if (min > c){
            min = c;
        }
        System.out.println(max);
    }
}
