package nimesh_week7;

import java.util.Scanner;

public class Class5 {
    private int employeid;
    private int empname;
    private int basicsalary, HRA, GS, TA, DA, PF;

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee id");
        employeid = scan.nextInt();
        System.out.println("Enter the employee name");
        empname = scan.nextInt();
        System.out.println("Enter the basic salary of an employee");
        basicsalary = scan.nextInt();
        System.out.println("Enter DA");
        basicsalary = scan.nextInt();
        System.out.println("Enter TA");
        basicsalary = scan.nextInt();
        System.out.println("Enter PF");
        basicsalary = scan.nextInt();
        System.out.println("Enter PF");
        basicsalary = scan.nextInt();
        calculate();
    }

    public void calculate() {
        HRA = (10  * basicsalary/100);
        DA = (8 * basicsalary/100);
        TA = (9 * basicsalary/100);
        PF = (2 * basicsalary/100);
        GS = basicsalary + HRA + TA + DA - PF;
    }

    public static void main(String[] args) {
        Class5 employeeobj = new employied();
        employeeobj.read();
        employeeobj.calculate();
        System.out.println( "|----------------------------------|");
        System.out.println("|        Salary slip                |");
        System.out.println("| Employee id     : 2564            |");
        System.out.println("| Employee Name    :  jack          |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Basic Salary     :25000.0         |");
        System.out.println("| HRA  10%         :2500.0          |");
        System.out.println("| TA   8%          :2250.0          |");
        System.out.println("| DA   9%          :2000.0          |");
        System.out.println("| PF -20&          :5000.0          |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Gross Salary     :26750.0         |");
        System.out.println("|-----------------------------------|");


    }

    private static class employied extends Class5 {
    }
}







