package first_moduledom2;

import java.util.Scanner;

public class new18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.next();
        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }

    }

}


