package es3;

import java.util.Scanner;

public class Esercizio3While {
    public static  void main(String[] args){
        System.out.println("Welcome!");
        System.out.println("Please insert a string");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        while (!myString.equals(":q")){
            String splitString = "";
            for(int i=0;i<myString.length();i++){
                splitString += myString.charAt(i);
                if(i<myString.length()-1) splitString += ",";
            }
            System.out.println("Your split string: " + splitString);
            System.out.println("Please insert the next string");
            myString = input.nextLine();
        };
        input.close();
        System.out.println("Game over");
    }
}
