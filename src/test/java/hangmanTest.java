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

    //
}
