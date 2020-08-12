package com.gameapi.gameapi.ui.controller;

import com.gameapi.gameapi.entity.GameStartAndEnd;
import com.gameapi.gameapi.service.GameStartAndEndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gamestartandend")
public class GameStartAndEndController {
    @Autowired
    private GameStartAndEndService gameStartAndEndService;
    @PostMapping("/")
    public ResponseEntity<GameStartAndEnd> createGameStartAndEnd(GameStartAndEnd gameStartAndEnd){
        return  ResponseEntity.ok().body(gameStartAndEndService.saveGameStartAndEnd(gameStartAndEnd)) ;
    }
}
