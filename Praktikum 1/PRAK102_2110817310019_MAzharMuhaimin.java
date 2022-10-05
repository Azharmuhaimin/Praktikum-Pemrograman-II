package Praktikum1;

import java.util.Scanner;

public class PRAK102_2110817310019_MAzharMuhaimin {
       public static void main(String args[])
   {
       int perulangan, deret, d;
       
       Scanner keyboard = new Scanner(System.in); 
       
       deret = keyboard.nextInt();
       perulangan = 1;
       while (perulangan <= 7){
       d = deret;
       if (deret % 2 == 0){
           d = (d / 2) -1;
           if (perulangan == 7){
           System.out.print(d + " ");
           } else {
           System.out.print(d + ", ");    
           }
       perulangan += 1;
       deret++;
       continue;
       } if (perulangan == 7){
           System.out.print(d + " ");
           } else {
           System.out.print(d + ", ");    
           }
       perulangan += 1;
       deret++;
       }
}
}