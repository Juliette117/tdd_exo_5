package org.example;

public class DiceScore {

    private final Ide de;

    public DiceScore(Ide de) {
        this.de = de;
    }

    public int getScore() {
        int firstScore = de.getRoll();
        int secondScore = de.getRoll();

        if(firstScore == secondScore) {
            if(firstScore == 6) {
                return 30;
            }

            return firstScore * 2 + 10;
        }

        return Math.max(firstScore, secondScore);
    }
}
