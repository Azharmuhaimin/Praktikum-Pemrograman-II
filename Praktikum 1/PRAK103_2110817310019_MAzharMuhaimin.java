package Praktikum1;

import java.util.Scanner;

public class PRAK103_2110817310019_MAzharMuhaimin {
           public static void main(String args[])
   {
       int perulangan, deret, d;
       
       Scanner keyboard = new Scanner(System.in); 
       
       deret = keyboard.nextInt();
       perulangan = 1;
       do {
       d = deret; 
       if (deret % 7 == 0){
           perulangan++;
           deret--;
           continue;
       }
       if (perulangan == 5)
           System.out.print(d + " ");
       else 
           System.out.print(d + ", ");
       perulangan++;
       deret--;
       } while (perulangan <= 5);
   }
}