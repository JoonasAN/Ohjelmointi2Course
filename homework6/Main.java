import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int guesses;
        int length;
        Wordlist wordlist = new Wordlist();
        String fileName;
        Character chr;
        boolean flag;
        boolean newGame;
        Hangman play;

        Scanner input = new Scanner(System.in);

        do {
            try {
                flag = true;
                System.out.print("Give wordlist file > ");
                fileName = input.nextLine();
                wordlist = new Wordlist(fileName + ".txt");
            } catch (Exception e) {
                System.out.println("No such file, Try again!");
                flag = false;
            }
        } while (flag == false);

        

        do{
            System.out.print("Play New Game? y/n > ");
            switch (input.nextLine()) {
                case "y":
                    newGame = true;

                    System.out.print("Filter words by length? y/n > ");
                    
                    switch (input.nextLine()) {
                        case "y":
                            System.out.print("Give length of words > ");
                            length = input.nextInt();
                            input.nextLine(); // clear buffer
                            wordlist = wordlist.theWordsOfLength(length);
                            break;
                    }
 
                    System.out.print("Give number of guesses > ");
                    guesses = input.nextInt();
                    input.nextLine(); // clear buffer

                    // Start Game
                    play = new Hangman(wordlist, guesses);

                    do {
                        System.out.print("Give character > ");

                        chr = input.next().charAt(0);
                        input.nextLine(); // clear buffer

                        if (play.guess(chr)) {
                            System.out.println();
                            System.out.println("Guesses left: " + play.guessesLeft());
                            System.out.println(play.draw());
                            System.out.println();
                            System.out.println(play.updateHiddenWord(chr));
                            System.out.println();
                        }
                        else if (play.guessesLeft() > 0) {

                            System.out.println("Wrong!");
                            System.out.println("Guesses left: " + play.guessesLeft());
                            System.out.println();
                            System.out.println(play.draw());
                            System.out.println();
                            System.out.println(play.word());
                            System.out.println();
                        }
                        else{
                            break;
                        }

                    } while (play.theEnd() != true);
                    if (play.theEnd() == true) {
                        System.out.println("You Won!");
                    } else {
                        System.out.println(play.draw());
                        System.out.println("You Lost!");
                    }

                    break;
                
                case "n":
                    newGame = false;
                    break;
                default:
                    newGame = true;
                    break;
            }
        } while(newGame);

        input.close();
    }
}
