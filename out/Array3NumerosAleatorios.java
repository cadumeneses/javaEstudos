import java.util.Random;

public class Array3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();


        int[] randomNumbers = new int[20];
        
        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            
            randomNumbers[i] = number;            
        }

        System.out.println("Random Numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");            
        }

        System.out.println();
        System.out.println();

        System.out.println("Successors of numbers: ");
        for (int number : randomNumbers) {
            System.out.print((number+1) + " ");

            
        }
        System.out.println();
        System.out.println();

        System.out.println("Predecessors of numbers: ");
        for (int number : randomNumbers) {
            System.out.print((number-1) + " ");

            
        }

    }
    
}
