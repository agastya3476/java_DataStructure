import java.util.Scanner;

/*
User will enter in 5 numbers
After 5 numbers will be returned to user
after the smallest of the 5 number will be told

Version 1

 */


public class Main {
    public static void main(String[] args) {
    int[] num = new int [5];
    int win;
    int a;

    System.out.println("Enter 5 Numbers:");
   // User input of array
   for (int i=0; i<5; i++) {
       // Scanner is a class, scanner is a object
       Scanner scannerObj = new Scanner(System.in);
       num[i] = scannerObj.nextInt();
   }

   // Print array
   System.out.println("The numbers inputted are: " + num[0] + " , " + num[1] + " , " +  num[2] + " , " +  num[3] + " , " +
           + num[4]);


    if (num [0] < num [1])
        win=num[0];
    else
        win = num[1];

    for (a=2; a<5; a++)
        if(win>num[a])
            win=num[a];


        System.out.println("The smallest number is "+ win);
    }

}







