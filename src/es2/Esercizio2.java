package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        System.out.println("Please provide an integer within the range of 0 to 3, inclusive");
        Scanner input = new Scanner(System.in);
        int myNum = Integer.parseInt(input.nextLine());
        switch (myNum){
            case 0 :{
                System.out.println("The number is zero");
                break;
            } case 1 :{
                System.out.println("The number is one");
                break;
            } case 2 :{
                System.out.println("The number is two");
                break;
            } case 3 :{
                System.out.println("The number is three");
                break;
            }
            default:{
                System.out.println("The number is out of range");
            }
        }
    }
}
