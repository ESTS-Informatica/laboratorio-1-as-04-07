
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;

    public WordGuessingGame(InputReader reader){
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        this.reader = reader;
    }

    public String getHiddenWord(){
        return hiddenWord;
    }

    public String getGuessedWord(){
        return guessedWord;
    }

    public int getNumberOfTries(){
        return numberOfTries;
    }

    public void play(char c){
        showWelcome();
        guess(c);
        if(guessedWord == hiddenWord){
            showResult();
        }
    }

    private void showGuessedWord(){
        System.out.println(reader.getChar(getGuessedWord()));
    }

    private void showWelcome(){
        System.out.println("*** Bem-vindo(a) ao Jogo! ***");
    }

    private void guess(char c){
        char guessedChar = reader.getChar(getGuessedWord());
        char hiddenChar = reader.getChar(getHiddenWord());
        
        for(int i=0; i < hiddenWord.length(); i++){
            if(guessedChar == hiddenWord.charAt(i)){
                guessedChar = hiddenChar;
            }
        }
    }

    private void showResult(){
        if(getHiddenWord() == getGuessedWord()){
            showGuessedWord();
            System.out.println("Número de tentativas: " + getNumberOfTries());
        }
    }
}
