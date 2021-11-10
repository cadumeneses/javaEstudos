import java.util.Scanner;

public class Ex3MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int number;
        int count = 0;
        int bigger= 0;
        float average= 0;

        do{
            System.out.println("Number: ");
            number = scan.nextInt();
            if (number > bigger) bigger = number;

            average = average + number;

            count = count + 1;
            
        } while(count < 5);

        average = average / 5 ;
       
        System.out.printf("The biggest number is: " + bigger);
        System.out.println();
        System.out.printf("The average is: " + average);

        

    }
    
}
