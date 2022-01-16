package Server;

/** Class of one point on board */

public class Point {
    private int pos_x;
    private int pos_y;
    private boolean is_used = false;
    private Color team_id = Color.GREY;
    private Color used_team_id = Color.GREY;

    public Point(int pos_x, int pos_y, boolean is_used, Color team_id, Color used_team_id) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.is_used = is_used;
        this.team_id = team_id;
        this.used_team_id = used_team_id;
    }

    /** @return int x coordinate */
    public int getPosX() {
        return this.pos_x;
    }

    /** @return int y coordinate */
    public int getPosY() {
        return this.pos_y;
    }

    /** @return boolean | if point is Used than true */
    public boolean getIsUsed(){
        return this.is_used;
    }

    /** @return ENUM Color of point owner*/
    public Color getTeamId() {
        return this.team_id;
    }

    /** @return String id of point owner */
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

    /** @return String id of player which used this point */
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

    /** @return ENUM Color id of player which used this point */
    public Color getUsedTeamId(){
        return this.used_team_id;
    }

    /** Change TeamId */
    public void changeTeamId(Color tid) {
        this.team_id = tid;
    }

    /** Change UsedTeamId */
    public void changeUsedTeamId(Color tid) {
        this.used_team_id = tid;
    }

    /** Toggle variable is_used */
    public void toggleIsUsed() {
        this.is_used = !this.is_used;
    }


}