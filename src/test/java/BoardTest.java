import Server.Board;
import Server.Color;
import Server.Row;
import Server.Point;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void shouldSendPoint() {
        Point p = new Point(2, 2, true, Color.GREY, Color.BLACK);
        ArrayList<Point> points = new ArrayList<>();
        points.add(p);
        Row row = new Row(points, 1, 2);
        ArrayList<Row> r = new ArrayList<>();
        r.add(row);
        Board b = new Board(r);
        Point point = b.getPoint(2, 2);

        assertEquals(point, p);
        assertTrue(p.getIsUsed());
        assertEquals(p.getTeamId(), Color.GREY);
        assertEquals(p.getUsedTeamId(), Color.BLACK);

    }
}
