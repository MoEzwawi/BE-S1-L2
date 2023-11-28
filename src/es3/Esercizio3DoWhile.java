package es3;

import java.util.Scanner;

public class Esercizio3DoWhile {
    public static  void main(String[] args){
        System.out.println("Welcome!");
        String myString;
        Scanner input = new Scanner(System.in);
        int count=0;
        do{
            if(count==0) System.out.println("Insert a string");
            else System.out.println("Insert the next string");
            count++;
            myString = input.nextLine();
            String splitString = "";
            for(int i=0;i<myString.length();i++){
                splitString += myString.charAt(i);
                if(i<myString.length()-1) splitString += ",";
            }
            System.out.println("Your split string: " + splitString);
        }while (!myString.equals(":q"));
        input.close();
        System.out.println("Game over");
    }
}
