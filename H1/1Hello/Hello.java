import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nAnna sukunimi: ");
        String lastname = input.nextLine();
        System.out.print("Anna etunimet erotettuna välilyönnillä: ");
        String name = input.nextLine();
    
        System.out.println("Tervetuloa Java ohjelmoinnin maailmaan " + name + " " + lastname);
        try {
            System.in.read();
        } catch (Exception e) {
            
        }
        input.close();
    }
}
