import org.junit.*;
import static org.junit.Assert.*;


public class hangmanTest{
    //Test if the word returns a string
    @Test
    public void game_WillReturnUsAString(){
        Hangman playHangman = new Hangman();
        assertEquals("David", playHangman.Words());
    }

    //Test to check if the words are randomized
    @Test
    public void game_WillRandomizeWords(){
        Hangman playHangman = new Hangman();
        assertEquals("David", playHangman.randomize());
    }

    //Test to see if Words are Split into Characters
    @Test
    public void game_WillMakeWordsCharacters(){
        Hangman playHangman = new Hangman();
        String [] charWord = {"D","a","v","i","d"};
        assertEquals(charWord, playHangman.convertToChar("David"));
    }

    //Test to break-up User Input
    @Test
    public void game_WillMakeUserInputCharacters(){
        Hangman playHangMan = new Hangman();
        String [] charWord = {"D","a","v","i","d"};
        assertEquals(charWord, playHangMan.convertUIToChar("David"));
    }
}
