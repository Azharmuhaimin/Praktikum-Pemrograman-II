package Praktikum1;

import java.util.Scanner;

public class PRAK104_2110817310019_MAzharMuhaimin {
    public static void main(String args[]){

        int andi1, budi1, andi2, budi2, andi3, budi3, pointAndi = 0, pointBudi=0;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Kartu Andi: ");

        andi1 = keyboard.nextInt();
        andi2 = keyboard.nextInt();
        andi3 = keyboard.nextInt();
        keyboard.nextLine();
         
        int [] andi = {andi1,andi2,andi3};

        System.out.print("Kartu Budi: ");
        
        budi1 = keyboard.nextInt();
        budi2 = keyboard.nextInt();
        budi3 = keyboard.nextInt();

        int [] budi = {budi1, budi2, budi3};

     if ((budi1 >= 2 && budi1 <=10) && (budi2 >= 2 && budi2 <=10) && (budi3 >= 2 && budi3 <=10) &&
                (andi1 >= 2 && andi1 <= 10) && (andi2 >= 2 && andi2<=10) && (andi3>=2 && andi3<=10)) {
        
        if (andi[0] > budi[0]) {
            pointAndi++;
        } else  if (budi[0] > andi[0]) {
            pointBudi++;
        }

        if(andi[1] > budi[1]) {
            pointAndi++;
        } else if (budi[1] > andi[1]) {
            pointBudi++;
        }

        if (andi[2] > budi[2]) {
            pointAndi++;
        } else if (budi[2] > andi[2]) {
            pointBudi++;
        }
          if (pointAndi > pointBudi) {
                System.out.println("Andi");
            } else if(pointBudi > pointAndi) {
                System.out.println("Budi");
            } else {
                System.out.println("Seri");
            } 
        }
        else {
                System.out.println("Invalid input kartu must be lebih dari 2 dan kurang dari 10");
            }
        }
    }
