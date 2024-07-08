package Player;

public class Player {
    private int playerId;
    private String playerName;
    private String playerType;
    private int playerRuns;
    private String matchType;

    public Player(int playerId, String playerName, String playerType, int playerRuns, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerType = playerType;
        this.playerRuns = playerRuns;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public int getPlayerRuns() {
        return playerRuns;
    }

    public void setPlayerRuns(int playerRuns) {
        this.playerRuns = playerRuns;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}
