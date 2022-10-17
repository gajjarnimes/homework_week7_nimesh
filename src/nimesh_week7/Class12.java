package nimesh_week7;

import java.util.Scanner;

public class Class12 {
    // CHECKING FOR ALPHABET
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the Character: ");
        //taking input from user
        char ch=inp.next().charAt(0);
        //checking condition for alphabet
        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
        {
            System.out.println(ch+" is an Alphabet.");
        }
        //checking condition for digit
        else if(ch>=48 && ch<=57)
        {
            System.out.println(ch+" is a digit.");
        }
        else
        {
            System.out.println(ch+" is a special character.");
        }
    }



    }



