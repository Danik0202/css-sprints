package first_moduledom2;

import java.util.Scanner;

public class new9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int come = 0;
        int count = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
                come = come + array[i];
        }
        int f = come/size;
        for (int i = 0; i < array.length; i++) {
            if (f<array[i]){
                System.out.print(array[i] + " ");
            }
        }
    }
}