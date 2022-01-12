import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;

        Scanner input = new Scanner(System.in); // scan input from keyboard

        do {
            System.out.print("Enter an integer, <= stops: ");
            number = input.nextInt();   // set input into variable
            if (number > 0) {
                count++;
                sum += number;
                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
            }
        } while (number > 0);
        input.close();  // close input
        if (count > 0){ // no division by 0
            System.out.println("Count:      " + count);
            System.out.println("Smallest:   " + smallest);
            System.out.println("Largest:    " + largest);
            double average = sum/(double)count;
            System.out.println("Average:    " + average);
        } else {
            System.out.println("No input from user!");
        }
        
    }    
}
