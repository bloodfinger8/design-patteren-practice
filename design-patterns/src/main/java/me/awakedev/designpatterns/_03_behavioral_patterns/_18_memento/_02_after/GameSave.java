package me.awakedev.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class GameSave {
    private int redTeamScore;
    private int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
}
