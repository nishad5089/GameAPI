package com.gameapi.gameapi.ui.controller;

import com.gameapi.gameapi.entity.Emoji;
import com.gameapi.gameapi.service.EmojiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emoji")
public class EmojiController {
    @Autowired
    private EmojiService emojiService;
    @PostMapping("/")
    public ResponseEntity<Emoji> createEmji(Emoji emoji){
     return  ResponseEntity.ok().body(emojiService.saveEmoji(emoji)) ;
    }
}
