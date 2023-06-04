package Program1_calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        char symbol;
        int a, b;
        String ch = "y";

        do {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first number : ");
            a = scan.nextInt();

            System.out.print("Enter second number : ");
            b = scan.nextInt();

            System.out.print("Please enter one of symbol +,-,*, /: ");
            symbol = scan.next().charAt(0);

            Main obj = new Main();
            obj.calculateResult(a, b, symbol);


            System.out.print("Would you like to do more calculation Please enter Y or N : ");
            ch = scan.next();
        }while(ch.equalsIgnoreCase("Y"));



    }

}
