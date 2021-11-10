import java.util.Scanner;

public class Ex4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count= 0;
        int numberQuantity;
        int number= 0;
        int numberPair = 0 , numberOdd= 0;
        

        System.out.println("Number of numbers: ");
        numberQuantity = scan.nextInt();

        do {
            System.out.println("Number: ");
            number = scan.nextInt();

            if(number % 2 == 0) numberPair++;
            else numberOdd ++;


            count++;

            
        } while (count < numberQuantity);

    System.out.println("Number of even numbers: " + numberPair);
    System.out.println("Odd number of numbers:  " + numberOdd);
    }
}
