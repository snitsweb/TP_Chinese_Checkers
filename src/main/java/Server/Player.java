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