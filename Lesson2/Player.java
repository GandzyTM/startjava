package GuessNumber;

public class Player {
    private int userNum;
    private int computerNum;
    private String playerName;

    public Player(String playerName, int userNum) {
        this.playerName = playerName;
        this.userNum = userNum;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }
}
