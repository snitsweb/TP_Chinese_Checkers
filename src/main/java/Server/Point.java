public class Point {
    private int pos_x;
    private int pos_y;
    private boolean is_used = false;
    private Color team_id = Color.GREY;
    private Color used_team_id = Color.GREY;

    Point(int pos_x, int pos_y, boolean is_used, Color team_id, Color used_team_id) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.is_used = is_used;
        this.team_id = team_id;
        this.used_team_id = used_team_id;
    }

    public int getPosX() {
        return this.pos_x;
    }

    public int getPosY() {
        return this.pos_y;
    }

    public boolean getIsUsed(){
        return this.is_used;
    }

    public Color getTeamId() {
        return this.team_id;
    }

    public Color getUsedTeamId(){
        return this.used_team_id;
    }

    public void changeTeamId(Color tid) {
        this.team_id = tid;
    }

    public void changeUsedTeamId(Color tid) {
        this.used_team_id = tid;
    }

    public void toggleIsUsed() {
        this.is_used = !this.is_used;
    }


}