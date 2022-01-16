package Server;

public class Player {
    private Color id;
    private Color opponent_id;
    private int score = 0;

    public Player(Color id, Color opponent_id){
        this.id = id;
        this.opponent_id = opponent_id;
    }

    /** @return Color id of player */
    public Color getId() {
        return this.id;
    }

    /** @return String id of player */
    public String getTextId() {
        if(this.id == Color.GREY) return "GREY";
        if(this.id == Color.RED) return "RED";
        if(this.id == Color.BLACK) return "BLACK";
        if(this.id == Color.BLUE) return "BLUE";
        if(this.id == Color.GREEN) return "GREEN";
        if(this.id == Color.WHITE) return "WHITE";
        if(this.id == Color.YELLOW) return "YELLOW";

        return "";
    }

    /** @return Color id of opponent */
    public Color getOpponentId() {
        return this.opponent_id;
    }
    /** Increase player score on 1*/
    public void increaseScore() {
        this.score = this.score + 1;
    }

    /** Change player score to set variable
     * @param score Score which you need to set to player */
    public void changeScore(int score) {
        this.score = score;
    }

    /** @return Score of player */
    public int getScore(){
        return this.score;
    }


}