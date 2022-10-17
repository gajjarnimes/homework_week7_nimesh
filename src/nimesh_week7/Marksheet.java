package nimesh_week7;

import java.util.Scanner;

public class Marksheet {
    static String Name = "jay";
    int Rollno = 2;
    static String Sub1 = "Maths";
    static String Sub2 = "Science";
    static String sub3 = "English";

    public static void main(String[] args) {
        String name;
        String Rollno;
        String Sub;
        String Sub2;
        String Sub3;
        double div;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name===>");
        name = scanner.nextLine();
        System.out.println("Enter Roll no");
        Rollno = scanner.nextLine();
        System.out.println("Enter your Maths Marks");
        Sub1 = scanner.nextLine();
        System.out.println("Enter your Science Marks");
        Sub2 = scanner.nextLine();
        System.out.println("Enter your English Marks");
        Sub3 = scanner.nextLine();
        int percentage = 65;
        if (percentage >= 80) {
            System.out.println("A+");
        } else if (percentage >= 60) {
            System.out.println("A");
        } else if (percentage >= 50) {
            System.out.println("B");
        } else if (percentage >= 35) {
            System.out.println("C");
        } else {
            System.out.println("Pass");
        }
        System.out.println("Result is Pass");
        System.out.println("---------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|               Mark sheet             |");
        System.out.println("|--------------------------------------|");
        System.out.println("|    Name       :    "+name+"          |");
        System.out.println("|    Roll no    :    "+2+"             |");
        System.out.println("|--------------------------------------|");
        System.out.println("|    Subjects    :                     |");
        System.out.println("|--------------------------------------|");
        System.out.println("|     Maths       :  "+Sub1+"          |");
        System.out.println("|     Science     :  "+Sub2+"          |");
        System.out.println("|     English     :  "+Sub3+"          |");
        System.out.println("|--------------------------------------|");
        System.out.println("|       Total     :                    |");
        System.out.println("|--------------------------------------|");
        System.out.println("|     Percentage  :                    |");
        System.out.println("|     Result      :                    |");
        System.out.println("|     Grade       :                    |");
        System.out.println("|--------------------------------------|");
        scanner.close();
    }
}



