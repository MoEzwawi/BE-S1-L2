package es3;

import java.util.Scanner;

public class Esercizio3WhileUtilizzandoAncheStringBuilder {
    public static  void main(String[] args){
        System.out.println("Welcome!");
        System.out.println("Please insert a string");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        while (!myString.equals(":q")){
            StringBuilder splitString = new StringBuilder();
            for(int i=0;i<myString.length();i++){
                splitString.append(myString.charAt(i));
                if(i<myString.length()-1) splitString.append(",");
            }
            System.out.println("Your split string: " + splitString);
            System.out.println("Please insert the next string");
            myString = input.nextLine();
        };
        input.close();
        System.out.println("Game over");
    }
}
