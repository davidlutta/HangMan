
import org.junit.*;

import static org.junit.Assert.*;


public class hangmanTest{
    @Test
    public void playHangman_randomnWord(){
      Hangman playHangman = new Hangman();
      assertEquals(playHangman.randomize());
    }
}
