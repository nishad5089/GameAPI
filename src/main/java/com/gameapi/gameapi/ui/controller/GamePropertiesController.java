package com.gameapi.gameapi.ui.controller;

import com.gameapi.gameapi.entity.GameProperties;
import com.gameapi.gameapi.service.GamePropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gameproperties")
public class GamePropertiesController {
    @Autowired
    private GamePropertiesService gamePropertiesService;
    @PostMapping("/")
    public ResponseEntity<GameProperties> createGameProperties(GameProperties gameProperties){
        return  ResponseEntity.ok().body(gamePropertiesService.saveGameProperties(gameProperties)) ;
    }
}
