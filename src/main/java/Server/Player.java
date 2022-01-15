package Server;

public class Player {
    private Color id;
    private Color opponent_id;
    private int score = 0;

    Player(Color id, Color opponent_id){
        this.id = id;
        this.opponent_id = opponent_id;
    }

    public Color getId() {
        return this.id;
    }

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

    public Color getOpponentId() {
        return this.opponent_id;
    }

    public void increaseScore() {
        this.score = this.score + 1;
    }

    public void changeScore(int score) {
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }


}