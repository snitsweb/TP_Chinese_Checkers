import Server.Color;
import Server.Player;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PlayerTest {

    @Test
    public void shouldSendPlayer() {
        Player p = new Player(Color.BLACK, Color.BLUE);

        assertEquals(Color.BLACK, p.getId());
        assertEquals(Color.BLUE, p.getOpponentId());
        assertEquals(0, p.getScore());
        p.increaseScore();
        assertEquals(1, p.getScore());
        p.changeScore(10);
        assertEquals(10, p.getScore());
    }
}
