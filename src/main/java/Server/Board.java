package Server;

/** Class of board */

import java.util.ArrayList;

public class Board {
    private ArrayList<Row> rows;
    private int board_width = 13;
    private int board_height = 17;
    private int user_area_rows = 4;

    public Board(ArrayList<Row> r){
        this.rows = r;
    }

    /** @return All rows in board */
    public ArrayList<Row> getRows() {
        return this.rows;
    }

    /** @return Point with set x and y */
    public Point getPoint(int x, int y){
        for(int i = 0; i < this.rows.size(); i++){
            if(this.rows.get(i).getIndex() == y){
                for(int j = 0; j < this.rows.get(i).getPoints().size(); j++){
                    if(this.rows.get(i).getPoints().get(j).getPosX() == x)
                        return this.rows.get(i).getPoints().get(j);
                }
            }
        }
        return null;
    }

}