import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nu  = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nu.add(in.nextInt());
        }
       int sum = nu.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}