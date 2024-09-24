package first_moduledom2;

import java.util.Scanner;

public class new15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        float come = 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) {
                come = come * array[i];

            }

        }System.out.println((int)come);
    }
}


