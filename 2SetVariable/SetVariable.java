import java.util.Scanner;

class SetVariable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // scan input from keyboard
        System.out.print("Enter an integer: ");
        int posNum = input.nextInt();   // set input into variable
        if (posNum >= 0) {
            System.out.printf("The given number is %d ", posNum);
        }
        else {
            System.out.print("The given number is not a positive integer.");
        }
        input.close(); // close input

    }
}