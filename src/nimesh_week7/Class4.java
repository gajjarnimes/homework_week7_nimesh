package nimesh_week7;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        isLeapYear(1900);
        int getDayInMonth;
    }

    public static void isLeapYear(int year) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        year = input.nextInt();
        boolean isLeap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap == true) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }
    }

    public static int getDayInMonth(int month, int year) {
        Scanner input = new Scanner(System.in);
        int number_of_DaysInMonth = 0;
        String MonthOfName = "Unknown";
        System.out.println("Input a month number:");
        month = input.nextInt();
        System.out.println("Input a year");
        year = input.nextInt();
        switch (month) {
            case 1:
                MonthOfName = "January";
                number_of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_of_DaysInMonth = 29;
                } else {
                    number_of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "Novermber";
                number_of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_of_DaysInMonth = 31;
                break;
        }
        System.out.println("MonthofName + " + year + " has " + number_of_DaysInMonth + "days\n");
        return number_of_DaysInMonth;
    }
}




