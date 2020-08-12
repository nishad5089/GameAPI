package com.gameapi.gameapi.entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "emoji")
public class Emoji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "userId")
    private int userId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "game_id")
    private int gameId;
    @Column(name = "current_difficulty_level")
    private int currentDifficultyLevel;
    @Column(name = "current_score")
    private int currentScore;
    @Column(name = "current_level")
    private int currentLevel;
    @Column(name = "current_stage")
    private int currentStage;
    @Column(name = "current_motion_given")
    private String currentMotionGiven;
    @Column(name = "response")
    private int response;
    @Column(name = "result_score", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean resultScore;
    @Column(name = "current_asset_display")
    private int currentAssetDisplay;
    @Column(name = "location",length = 200)
    private String location;
    @Column(name = "movement")
    private float movement;
    @Column(name = "timeStamp")
    private LocalDateTime timeStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getCurrentDifficultyLevel() {
        return currentDifficultyLevel;
    }

    public void setCurrentDifficultyLevel(int currentDifficultyLevel) {
        this.currentDifficultyLevel = currentDifficultyLevel;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(int currentStage) {
        this.currentStage = currentStage;
    }

    public String getCurrentMotionGiven() {
        return currentMotionGiven;
    }

    public void setCurrentMotionGiven(String currentMotionGiven) {
        this.currentMotionGiven = currentMotionGiven;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public boolean isResultScore() {
        return resultScore;
    }

    public void setResultScore(boolean resultScore) {
        this.resultScore = resultScore;
    }

    public int getCurrentAssetDisplay() {
        return currentAssetDisplay;
    }

    public void setCurrentAssetDisplay(int currentAssetDisplay) {
        this.currentAssetDisplay = currentAssetDisplay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getMovement() {
        return movement;
    }

    public void setMovement(float movement) {
        this.movement = movement;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
