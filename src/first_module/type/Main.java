package first_module.type;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i]= in.nextInt();
            }catch (InputMismatchException e){
                arr[i]=0;
                in.next();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]*arr[i] + " ");
        }
    }
}
