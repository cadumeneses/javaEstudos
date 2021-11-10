import java.util.Scanner;

public class Ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Number: ");
        number = scan.nextInt();

        for (int j = 1;  j<=10; j++) {
            System.out.println(number + " X " + j + " = " + number * j);
           
        }
       

    }

}
