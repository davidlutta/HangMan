import org.junit.*;
import static org.junit.Assert.*;


public class hangmanTest{
    //Test if the word returns a string
    @Test
    public void game_WillReturnUsAString(){
        Hangman playHangman = new Hangman();
        assertEquals("David", playHangman.Words());
    }
}
