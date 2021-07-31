//This is a program that does some basic calculator's functions

import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
import static java.lang.System.exit;

class Calculator {
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            //MENU
            System.out.println("\nWHAT DO YOU WANT TO DO?");
            System.out.println("PLEASE SELECT A NUMBER..\n");
            System.out.println("******************************************************************");
            System.out.println("1. Add numbers");
            System.out.println("2. Division numbers");
            System.out.println("3. Help numbers");
            System.out.println("4. Exit numbers");
            System.out.println("******************************************************************");
            int select;
            do {
                select = in.nextInt(); //select is our variable for the switch-case in order to chose an option
            } while (select < 1 || select > 4);

            switch (select) {
                case (1):
					System.out.println("Give me the numbers");
                    Scanner input = new Scanner(System.in);
                    String qerry = input.next(); //qerry is the String in which we will store the user's input
                   
				    int sum=0; // sum is the variable
                    while (!qerry.equals("end")){ // we check if the input is or ends with "end" in order to break the loop
                        sum += Integer.parseInt(qerry); // cast String to Int and add them in variable sum
                        qerry = input.next(); //read the next String which will be a number to add or the "end" word
                    }

                    //Print sum
					System.out.println("Result ");
                    System.out.println(sum);
                    break;

                case (2):
                    int a, b; //these are the two user's input numbers
                    System.out.println("Give me two numbers \n");
                    a = in.nextInt();
                    b = in.nextInt();
                    if (a == 0) {
                        System.out.println("INVALID INPUT FIRST PARAMETER CANNOT BE 0");
                    } else {
						System.out.println("Result ");
                        System.out.println((float) a / b);
                    }

                    break;

                case (3):
                          System.out.println("Options:");
						  System.out.println("1= Operates addition for as may numbers as the user wants");
						  System.out.println("2= Convert from Fahrenheit to Celsius");
					      System.out.println("4= exits the program");
						  System.out.println("For more help visit 'The Sergis Nikolaos Manual'");
					break;
                case (4):
                    exit(0);
                    break;

                default:
                    System.out.println("invalid input");
            }
        }
    }
}