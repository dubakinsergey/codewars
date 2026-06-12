package com.hasl.kyu8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }
}

// "rock", "scissors" → Player 1 won!
// "scissors", "paper" → "Player 1 won!"
// "paper", "rock" → "Player 1 won!"
// иначе "Player 2 won!" или "Draw!"