package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] guestsList= {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone","Rachel Zeilic"};
        //Arrays.toString(guestsList);


        System.out.println("come ti chiami?");
        String userName= scanner.nextLine();
        userName=userName.trim();
        userName=userName.toLowerCase();

        boolean accepted= false;

        for (int i = 0; i < guestsList.length && !accepted; i++) {
            guestsList[i]= guestsList[i].trim();
            guestsList[i]=guestsList[i].toLowerCase();

            if (userName.equals(guestsList[i])){
                accepted=true;
            }
        }

        if (accepted){
            System.out.println("sei stato invitato puoi entrare");
        }else{
            System.out.println("non sei stato invitato non puoi entrare");
        }


        //BONUS

        System.out.println("\ncome ti chiami?");
        String userName1= scanner.nextLine();
        userName1=userName1.trim();
        userName1=userName1.toLowerCase();

        boolean accepted1= false;
        int i=0;
        while(i<guestsList.length && !accepted1){
            guestsList[i]= guestsList[i].trim();
            guestsList[i]=guestsList[i].toLowerCase();
            if (userName1.equalsIgnoreCase(guestsList[i])){
                accepted1=true;
            }
            i++;
        }

        if (accepted1){
            System.out.println("sei stato invitato puoi entrare");
        }else{
            System.out.println("non sei stato invitato non puoi entrare");
        }


        scanner.close();

    }
}
