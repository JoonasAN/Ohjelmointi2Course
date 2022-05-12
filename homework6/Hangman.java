import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Hangman {
    private int guessesLeft;
    private int guessesInit;
    private int wordIndex;
    private Wordlist wordlist;
    private String randomWord;
    private String hiddenWordString;
    private String gallows;
    private List<String> hiddenWord;
    private Set<Character> wordChars;
    private List<Character> wordCharsList;
    private List<Character> guessesList;
    private Random random;

    public Hangman(Wordlist wordlist, int guessesInit) {
        this.wordlist = wordlist;
        this.guessesLeft = guessesInit;
        this.guessesInit = guessesLeft;
        this.gallows = "";
        this.random = new Random();
        this.hiddenWord = new ArrayList<>();
        this.wordChars = new HashSet<>();
        this.wordCharsList = new ArrayList<>();
        this.guessesList = new ArrayList<>();
        
        this.wordIndex = random.nextInt(wordlist.giveWords().size());
        this.randomWord = this.wordlist.giveWords().get(wordIndex);

        for (Character character : randomWord.toCharArray()) {
            this.wordChars.add(character);
            this.wordCharsList.add(character);
        }

        for (int i = 0; i < randomWord.length(); i++) {
            this.hiddenWord.add("_");
        }

        this.hiddenWordString = String.join("", hiddenWord);
    }

    public boolean guess(Character chr) {
        if (wordChars.contains(chr)) {
            this.guessesList.add(chr);
            return true;
        }
        else {
            this.guessesLeft--;
            this.guessesList.add(chr);
            return false;
        }
    }

    public List<Character> guesses() {
        return this.guessesList;
    }

    public int guessesLeft() {
        return this.guessesLeft;
    }

    public String word() { 
        return this.hiddenWordString;
    }

    public boolean theEnd(){
        if (guessesList.containsAll(wordChars)) {
            return true;
        } else {
            return false;
        }
    }

    public String updateHiddenWord(Character chr) {

        int index = randomWord.indexOf(chr);

        while (index >= 0) {
            hiddenWord.set(index, Character.toString(chr));
            index = randomWord.indexOf(chr, index + 1);
        }
        hiddenWordString = String.join("", hiddenWord);
        return hiddenWordString;
        
    }

    public String draw() {
        // returns string picturing gallows if max guesses > 10
        if (guessesInit > 9) {
            switch (this.guessesLeft) {
                case 9:
                    gallows =   "___|__________";
                    break;

                case 8:

                    gallows =   "   |/         \n"+
                                "   |          \n"+
                                "   |          \n"+
                                "   |          \n"+
                                "   |          \n"+
                                "   |          \n"+
                                "___|__________";

                    break;
                    
                case 7:
                    gallows =   "    _______     \n"+
                                "   |/           \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "___|__________";
                    break;
                
                case 6:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "___|__________";
                    break;

                case 5:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |      (_)   \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "___|__________";
                    break;

                case 4:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |      (_)   \n"+
                                "   |       |    \n"+
                                "   |       |    \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "___|__________";
                    break;
                    
                case 3:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |      (_)   \n"+
                                "   |      /|    \n"+
                                "   |       |    \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "___|__________";
                    break;
                
                case 2:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |      (_)   \n"+
                                "   |      /|\\  \n"+
                                "   |       |    \n"+
                                "   |            \n"+
                                "   |            \n"+
                                "___|__________";
                    break;

                case 1:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |      (_)   \n"+
                                "   |      /|\\  \n"+
                                "   |       |    \n"+
                                "   |      /     \n"+
                                "   |            \n"+
                                "___|__________";
                    break;
                case 0:
                    gallows =   "    _______     \n"+
                                "   |/      |    \n"+
                                "   |      (_)   \n"+
                                "   |      /|\\  \n"+
                                "   |       |    \n"+
                                "   |      / \\  \n"+
                                "   |            \n"+
                                "___|__________";
                    break;
                default:
                    break;
            }
            return gallows;
        } else {
            return gallows;
        }
    }

    // getters and setters

    public void setGuessesLeft(int guessesLeft) {
        this.guessesLeft = guessesLeft;
    }

    public void setGuessesList(ArrayList<Character> guessesList) {
        this.guessesList = guessesList;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public void setWordlist(Wordlist wordlist) {
        this.wordlist = wordlist;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setWordChars(Set<Character> wordChars) {
        this.wordChars = wordChars;
    }

    public void setWordCharsList(List<Character> wordCharsList) {
        this.wordCharsList = wordCharsList;
    }

    public Set<Character> getWordChars() {
        return wordChars;
    }

    public List<Character> getWordCharsList() {
        return wordCharsList;
    }

    public int getWordIndex() {
        return wordIndex;
    }

}
