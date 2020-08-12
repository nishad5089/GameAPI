package com.gameapi.gameapi.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "game_start_end")
public class GameStartAndEnd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "game_start")
    private LocalDate gameStart;
    @Column(name = "game_end")
    private LocalDate gameEnd;
    @Column(name = "game_id")
    private int gameId;
    @Column(name = "ip_address")
    private String ipAddress;
    @Column(name = "deviceId")
    private int deviceId;

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

    public LocalDate getGameStart() {
        return gameStart;
    }

    public void setGameStart(LocalDate gameStart) {
        this.gameStart = gameStart;
    }

    public LocalDate getGameEnd() {
        return gameEnd;
    }

    public void setGameEnd(LocalDate gameEnd) {
        this.gameEnd = gameEnd;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }
}
