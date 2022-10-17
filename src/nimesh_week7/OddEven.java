package nimesh_week7;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();

        String result = (num %  2 ==0) ? "Even": "Odd";
        System.out.println("Number is:"+ result);
        scanner.close();

    }
}
