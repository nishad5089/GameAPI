package com.gameapi.gameapi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "game_properties")
public class GameProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "game_id")
    private int gameId;
    @Column(name = "template_id")
    private int templateId;
    @Lob
    @Column(name="game_purpose", length=512)
    private String gamePurpose;
    @Column(name="asset_allowed", length=200)
    private String assetAllowed;
    @Column(name="texture_option")
    private int textureOption;
    @Column(name="background_id")
    private int backgroundId;
    @Column(name="difficulty_level_option")
    private int difficultyLevelOption;
    @Column(name="max_score")
    private int maxScore;
    @Column(name="max_stages")
    private int maxStages;
    @Column(name="max_level")
    private int maxLevel;
    @Column(name="speed_options")
    private int speedOptions;
    @Column(name="create_time")
    private LocalDateTime crateTime;
    @Column(name="publish_time")
    private LocalDateTime publishTime;
    @Column(name="sound_level")
    private int soundLevel;
    @Column(name = "day_night_mode", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean dayNightMode;
    @Column(name="weather_selected")
    private int weatherSelected;

    public GameProperties() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getGamePurpose() {
        return gamePurpose;
    }

    public void setGamePurpose(String gamePurpose) {
        this.gamePurpose = gamePurpose;
    }

    public String getAssetAllowed() {
        return assetAllowed;
    }

    public void setAssetAllowed(String assetAllowed) {
        this.assetAllowed = assetAllowed;
    }

    public int getTextureOption() {
        return textureOption;
    }

    public void setTextureOption(int textureOption) {
        this.textureOption = textureOption;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public int getDifficultyLevelOption() {
        return difficultyLevelOption;
    }

    public void setDifficultyLevelOption(int difficultyLevelOption) {
        this.difficultyLevelOption = difficultyLevelOption;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getMaxStages() {
        return maxStages;
    }

    public void setMaxStages(int maxStages) {
        this.maxStages = maxStages;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getSpeedOptions() {
        return speedOptions;
    }

    public void setSpeedOptions(int speedOptions) {
        this.speedOptions = speedOptions;
    }

    public LocalDateTime getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(LocalDateTime crateTime) {
        this.crateTime = crateTime;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean isDayNightMode() {
        return dayNightMode;
    }

    public void setDayNightMode(boolean dayNightMode) {
        this.dayNightMode = dayNightMode;
    }

    public int getWeatherSelected() {
        return weatherSelected;
    }

    public void setWeatherSelected(int weatherSelected) {
        this.weatherSelected = weatherSelected;
    }
}
