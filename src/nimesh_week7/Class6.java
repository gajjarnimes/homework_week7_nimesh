package nimesh_week7;

import java.util.Scanner;

public class Class6 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered  number is Even");
        } else
            System.out.println("Entered number is Odd");
        scanner.close();


    }
}






