package Eureka.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private static Player currentPlayer;
    
    private String username;
    private String password;
    private LocalDate registrationDate;
    private int score; // score 
    private int dailyChallengesCompleted; // nbr de defis quotidiens terminés
    private int BestScore;
    private int totalGamesPlayed; // nbr total de parties jouées
    private List<Badge> badges; // liste des badges obtenus
    private int streakCount; // nbr de reponses consecutives correctes
    private LocalTime longestCompletionTime; // temps le plus long pour terminer un défi
    private int correctAnswersScience; // compteur de réponses correctes pour le thème Science
    private int correctAnswersHistory; 
    private int correctAnswersGeography; 
    private int correctAnswersSport;
    private int correctAnswersArt;
    private int correctAnswersJava;
    private int correctAnswersIslam;

    public Player(String username, String password, LocalDate registrationDate) {
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
        this.score = 0;
        this.badges = new ArrayList<>();
        this.BestScore = 0;
        this.dailyChallengesCompleted = 0;
        this.totalGamesPlayed = 0;
        this.streakCount = 0;
        this.longestCompletionTime = LocalTime.of(0, 0, 0);
        this.correctAnswersScience = 0;
        this.correctAnswersHistory = 0;
        this.correctAnswersGeography = 0;
        this.correctAnswersSport = 0;
        this.correctAnswersArt = 0;
        this.correctAnswersJava = 0;
        this.correctAnswersIslam = 0;
    }

    public Player(String username, String password, LocalDate registrationDate, int score, int dailyChallengesCompleted, int bestScore, int totalGamesPlayed, int streakCount, LocalTime longestCompletionTime, int correctAnswersScience, int correctAnswersHistory, int correctAnswersGeography, int correctAnswersSport, int correctAnswersArt, int correctAnswersJava, int correctAnswersIslam) {
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
        this.score = score;
        this.dailyChallengesCompleted = dailyChallengesCompleted;
        BestScore = bestScore;
        this.totalGamesPlayed = totalGamesPlayed;
        this.streakCount = streakCount;
        this.longestCompletionTime = longestCompletionTime;
        this.correctAnswersScience = correctAnswersScience;
        this.correctAnswersHistory = correctAnswersHistory;
        this.correctAnswersGeography = correctAnswersGeography;
        this.correctAnswersSport = correctAnswersSport;
        this.correctAnswersArt = correctAnswersArt;
        this.correctAnswersJava = correctAnswersJava;
        this.correctAnswersIslam = correctAnswersIslam;
    }

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        Player.currentPlayer = currentPlayer;
    }
    
    public String getUsername() {
        return username;   
    }

    public String getPassword() { 
        return password; 
    }

    public LocalDate getRegistrationDate() { 
        return registrationDate; 
    }
    
    public int getBestScore() { 
        return BestScore; 
    }

    public void setBestScore(int BestScore) { 
        this.BestScore = BestScore; 
    }

    public int getScore() { 
        return score; 
    }

    public void addScore(int points) { 
        this.score += points; 
    }

    public int getDailyChallengesCompleted() { 
        return dailyChallengesCompleted; 
    }

    public void completeDailyChallenge() { 
        this.dailyChallengesCompleted++; 
    }

    public int getTotalGamesPlayed() { 
        return totalGamesPlayed; 
    }

    public void incrementGamesPlayed() { 
        this.totalGamesPlayed++; 
    }

    public void addBadge(Badge badge) {
        badges.add(badge);
    }
    
    public List<Badge> getBadges() { 
        return badges; 
    }

    public int getStreakCount() { 
        return streakCount; 
    }

    public void incrementStreak() { 
        this.streakCount++; 
    }

    public void resetStreak() { 
        this.streakCount = 0; 
    }

    public LocalTime getLongestCompletionTime() { 
        return longestCompletionTime; 
    }

    public int getCorrectAnswersScience() { 
        return correctAnswersScience; 
    }

    public int getCorrectAnswersHistory() { 
        return correctAnswersHistory; 
    }

    public int getCorrectAnswersGeography() { 
        return correctAnswersGeography; 
    }

    public int getCorrectAnswersSport() { 
        return correctAnswersSport; 
    }

    public int getCorrectAnswersArt() { 
        return correctAnswersArt; 
    }

    public int getCorrectAnswersJava() { 
        return correctAnswersJava; 
    }

    public int getCorrectAnswersIslam() { 
        return correctAnswersIslam; 
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCorrectAnswersScience(int correctAnswersScience) {
        this.correctAnswersScience = correctAnswersScience;
    }

    public void setCorrectAnswersHistory(int correctAnswersHistory) {
        this.correctAnswersHistory = correctAnswersHistory;
    }

    public void setCorrectAnswersGeography(int correctAnswersGeography) {
        this.correctAnswersGeography = correctAnswersGeography;
    }

    public void setCorrectAnswersSport(int correctAnswersSport) {
        this.correctAnswersSport = correctAnswersSport;
    }

    public void setCorrectAnswersArt(int correctAnswersArt) {
        this.correctAnswersArt = correctAnswersArt;
    }

    public void setCorrectAnswersJava(int correctAnswersJava) {
        this.correctAnswersJava = correctAnswersJava;
    }

    public void setCorrectAnswersIslam(int correctAnswersIslam) {
        this.correctAnswersIslam = correctAnswersIslam;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }
    
    public void setStreakCount(int streakCount) {
        this.streakCount = streakCount;
    }
}
