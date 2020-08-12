package com.gameapi.gameapi.ui.controller;

import com.gameapi.gameapi.entity.GameStartAndEnd;
import com.gameapi.gameapi.entity.HappyBird;
import com.gameapi.gameapi.service.GameStartAndEndService;
import com.gameapi.gameapi.service.HappyBirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("happybird")
public class HappyBirdController {
    @Autowired
    private HappyBirdService happyBirdService;
    @PostMapping("/")
    public ResponseEntity<HappyBird> createHappyBird(HappyBird happyBird){
        return  ResponseEntity.ok().body(happyBirdService.saveHappyBird(happyBird)) ;
    }
}
