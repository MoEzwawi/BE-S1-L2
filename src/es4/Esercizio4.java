package es4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args){
        System.out.println("Insert a positive integer");
        Scanner input = new Scanner(System.in);
        int myInteger = Integer.parseInt(input.nextLine());
        while(myInteger<0){
            System.out.println("Please insert a positive integer");
            myInteger = Integer.parseInt(input.nextLine());
        }
        for(int i=myInteger;i>=0;i--){
            System.out.println(i);
        }
    }
}
