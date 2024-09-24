package collection;

import java.util.HashMap;
import java.util.Scanner;
public class Collect1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hashset = new HashMap<>();
        for (int i = 0; i < hashset.size(); i++) {
            hashset.put(in.next(), in.nextInt());
        }

        for (int i = 0; i < hashset.size(); i++) {
            System.out.println(hashset.keySet() + " costs " + hashset.values() + " USD");
        }

    }
}