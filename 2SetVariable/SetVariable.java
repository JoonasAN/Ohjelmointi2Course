import java.util.Scanner;

class SetVariable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int posNum = input.nextInt();
        if (posNum >= 0) {
            System.out.printf("The given number is %d ", posNum);
        }
        else {
            System.out.print("The given number is not a positive integer.");
        }
    }
}