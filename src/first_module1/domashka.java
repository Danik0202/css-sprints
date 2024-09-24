package first_module1;

import java.util.Scanner;

public class domashka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = in.next();
        String Surname = in.next();
        int age = in.nextInt();
        String Country = in.next();
        System.out.println("Name: " + Name);
        System.out.println("Surname: " + Surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + Country);

    }
}
