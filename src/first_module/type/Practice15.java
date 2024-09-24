package first_module.type;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String CompanyName = in.next();
        int profit = in.nextInt();
        double month = in.nextDouble();
        System.out.println("Company " + CompanyName + " earns " + (profit/month) + " dollars in a month");

    }
}
