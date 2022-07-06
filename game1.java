package com.nasarvali;
import java.util.Scanner;
import java.util.Random;

public class game1 {

    public static void main(String[] args) {
        int b;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("choose:\n0 for Rock\n1 for paper\n2 for scissors");
            int userInput = sc.nextInt();
            Random random = new Random();
            int computerInput = random.nextInt(3);
            if (userInput == computerInput)
                System.out.println("Draw!!!");
            else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
                System.out.println("you win!!!");
            } else System.out.println("you loose!!!");

            //   System.out.println("you choose"+userInput);
            if (computerInput == 0) {
                System.out.println("computer choice:Rock");
            } else if (computerInput == 1) {
                System.out.println("computer choice:paper");
            } else if (computerInput == 2) {
                System.out.println("computer choice:Scissors");
            }
            System.out.println("do you want to play again\n press 1 to continue:");
            b = sc.nextInt();
        }while(b==1);


    }
}


