import java.util.ArrayList;

public class Row {
    private ArrayList<Point> points;
    private int row_width;
    private int row_index;

    Row(ArrayList<Point> arr, int row_width, int row_index){
        this.points = arr;
        this.row_index = row_index;
        this.row_width = row_index;
    }

    public int getIndex() {
        return this.row_index;
    }

    public int getWidth(){
        return this.row_width;
    }

    public void addPoint(Point p){
        points.add(p);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

}