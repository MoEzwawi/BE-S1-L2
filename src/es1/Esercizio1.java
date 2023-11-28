package es1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args){
        System.out.println("Type a string");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        boolean isItEven = stringaPariDispari(myString);
        if(isItEven) System.out.println("The string has an even number of characters");
        else System.out.println("The string has an odd number of characters");
        System.out.println(" ");
        System.out.println("Insert a year");
        int year = Integer.parseInt(input.nextLine());
        boolean isItLeap = annoBisestile(year);
        if(isItLeap) System.out.println(year + " is a leap year!");
        else System.out.println(year + " is a common year!");
        input.close();
    }
    public static boolean stringaPariDispari(String s){
        return s.length() % 2 == 0;
    }
    public static boolean annoBisestile(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
