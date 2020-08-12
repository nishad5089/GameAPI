package com.gameapi.gameapi.service.Impl;

import com.gameapi.gameapi.entity.GameStartAndEnd;
import com.gameapi.gameapi.repository.GamePropertiesRepository;
import com.gameapi.gameapi.repository.GameStartAndEndRepository;
import com.gameapi.gameapi.service.GameStartAndEndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameStartAndEndServiceImpl implements GameStartAndEndService {
    @Autowired
   private GameStartAndEndRepository gamePropertiesRepository;
    @Override
    public GameStartAndEnd saveGameStartAndEnd(GameStartAndEnd gameStartAndEnd) {
        return gamePropertiesRepository.save(gameStartAndEnd);
    }
}
