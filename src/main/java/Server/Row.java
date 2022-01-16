package Server;

/** Class of one row on board */


import java.util.ArrayList;

public class Row {
    private ArrayList<Point> points;
    private int row_width;
    private int row_index;

    public Row(ArrayList<Point> arr, int row_width, int row_index){
        this.points = arr;
        this.row_index = row_index;
        this.row_width = row_index;
    }

    /** @return index of row */
    public int getIndex() {
        return this.row_index;
    }

    /** @return row size */
    public int getWidth(){
        return this.row_width;
    }

    /** Adds point to row */
    public void addPoint(Point p){
        points.add(p);
    }

    /** @return all points existed in row */
    public ArrayList<Point> getPoints() {
        return points;
    }

}