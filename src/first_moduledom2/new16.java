package first_moduledom2;

import java.util.Scanner;

public class new16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String s = in.next();
        String b = a.toLowerCase();
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == s.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);

    }

}


