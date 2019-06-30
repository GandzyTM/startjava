public class Player {
    private int userNum;
    private String playerName;

    public Player(String playerName) {

        this.playerName = playerName;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getUserNum() {
        return userNum;
    }
}
