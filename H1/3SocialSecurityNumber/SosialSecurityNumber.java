import java.util.Scanner;

public class SosialSecurityNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give Social security number: ");

        String id = input.nextLine();
        printBirthdate(id);
        input.close();
    }

    static boolean checkIdNumber(final String SSN) {
        // 123456-123A
        if (SSN.length() == 11 &&
                (SSN.charAt(6) == '-' || SSN.charAt(6) == '+' || SSN.charAt(6) == 'A')) {
            return true;
        }
        return false;

    }

    static void printBirthdate(final String SSN) {
        if (checkIdNumber(SSN)) {
            // print birthtime
            System.out.println("Real SSN");
            System.out.print(SSN.substring(0, 2));
            System.out.print(".");
            System.out.print(SSN.substring(2, 4));
            System.out.print(".");
            switch (SSN.charAt(6)) {
                case '-':
                    System.out.print("19");
                    break;
                case '+':
                    System.out.print("18");
                    break;
                case 'A':
                    System.out.print("20");
                    break;
                default:
                    System.out.print("??");
                    break;
            }
            System.out.println(SSN.substring(4,6));
        } else {
            System.out.println("Not a Social security number!");
        }
    }
}
