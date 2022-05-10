import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class Wordlist {
    private List<String> wordList = new ArrayList<String>();
    private List<String> newWordList = new ArrayList<String>();
    private Wordlist newWordlistObj;

    public Wordlist(){
    }

    public Wordlist(List<String> wordlist){
        this.wordList = wordlist; 
    }

    public Wordlist(String pathName) throws Exception{
        // make list of words from file
        try {
            File file = new File(pathName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String word = reader.nextLine();
                this.wordList.add(word.toLowerCase());
            }
            // System.out.println(wordList);
            reader.close();
        } catch (Exception e) {
            // System.out.println("An Error occured: ");
            // e.printStackTrace();
            if (e != null){
                throw new Exception("No such file, Try again!");
            }
        }
    }

    public List<String> giveWords(){
        return wordList;    
    }

    public Wordlist theWordsOfLength(int length){
        for (String word : wordList) {
            if (word.length() == length){
                newWordList.add(word);
                // wordList.remove(word);
            }
        }
        newWordlistObj = new Wordlist(newWordList);
        return newWordlistObj;
    }

    public Wordlist theWordsWithCharacters(String string){
        newWordlistObj = new Wordlist(wordList);
        for (String word : this.wordList) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != string.charAt(i)) {
                    newWordlistObj.wordList.add(word.replace(word.charAt(i), '_'));
                }
            }
        }
        return newWordlistObj;
    }

}
