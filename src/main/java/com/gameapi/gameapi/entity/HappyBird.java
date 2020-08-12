package com.gameapi.gameapi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "happy_bird")
public class HappyBird {
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
    @Column(name = "current_heath")
    private String currentHeath;
    @Column(name = "response")
    private int response;
    @Column(name = "type_of_current_obstacle",length = 200)
    private String typeOfCurrentObstacle;
    @Column(name = "value_of_current_obstacle",length = 200)
    private String valueOfCurrentObstacle;
    @Column(name = "time_for_current_obstacle")
    private LocalDateTime timeForCurrentObstacle;
    @Column(name = "value_of_current_rewards",length = 200)
    private String valueOfCurrentRewards;
    @Column(name = "type_for_current_rewards",length = 200)
    private String typeForCurrentRewards;
    @Column(name = "time_for_current_rewards")
    private LocalDateTime timeForCurrentRewards;
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

    public String getCurrentHeath() {
        return currentHeath;
    }

    public void setCurrentHeath(String currentHeath) {
        this.currentHeath = currentHeath;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public String getTypeOfCurrentObstacle() {
        return typeOfCurrentObstacle;
    }

    public void setTypeOfCurrentObstacle(String typeOfCurrentObstacle) {
        this.typeOfCurrentObstacle = typeOfCurrentObstacle;
    }

    public String getValueOfCurrentObstacle() {
        return valueOfCurrentObstacle;
    }

    public void setValueOfCurrentObstacle(String valueOfCurrentObstacle) {
        this.valueOfCurrentObstacle = valueOfCurrentObstacle;
    }

    public LocalDateTime getTimeForCurrentObstacle() {
        return timeForCurrentObstacle;
    }

    public void setTimeForCurrentObstacle(LocalDateTime timeForCurrentObstacle) {
        this.timeForCurrentObstacle = timeForCurrentObstacle;
    }

    public String getValueOfCurrentRewards() {
        return valueOfCurrentRewards;
    }

    public void setValueOfCurrentRewards(String valueOfCurrentRewards) {
        this.valueOfCurrentRewards = valueOfCurrentRewards;
    }

    public String getTypeForCurrentRewards() {
        return typeForCurrentRewards;
    }

    public void setTypeForCurrentRewards(String typeForCurrentRewards) {
        this.typeForCurrentRewards = typeForCurrentRewards;
    }

    public LocalDateTime getTimeForCurrentRewards() {
        return timeForCurrentRewards;
    }

    public void setTimeForCurrentRewards(LocalDateTime timeForCurrentRewards) {
        this.timeForCurrentRewards = timeForCurrentRewards;
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
