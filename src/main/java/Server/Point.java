package Server;

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

    public String getTextTeamId(String id) {
        if(this.team_id == Color.GREY) return "GREY";
        if(this.team_id == Color.RED) return "RED";
        if(this.team_id == Color.BLACK) return "BLACK";
        if(this.team_id == Color.BLUE) return "BLUE";
        if(this.team_id == Color.GREEN) return "GREEN";
        if(this.team_id == Color.WHITE) return "WHITE";
        if(this.team_id == Color.YELLOW) return "YELLOW";

        return "";
    }

    public String getTextUsedTeamId() {
        if(this.used_team_id == Color.GREY) return "GREY";
        if(this.used_team_id == Color.RED) return "RED";
        if(this.used_team_id == Color.BLACK) return "BLACK";
        if(this.used_team_id == Color.BLUE) return "BLUE";
        if(this.used_team_id == Color.GREEN) return "GREEN";
        if(this.used_team_id == Color.WHITE) return "WHITE";
        if(this.used_team_id == Color.YELLOW) return "YELLOW";

        return "";
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