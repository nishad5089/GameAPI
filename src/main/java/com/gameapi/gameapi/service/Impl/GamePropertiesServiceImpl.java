package com.gameapi.gameapi.service.Impl;

import com.gameapi.gameapi.entity.GameProperties;
import com.gameapi.gameapi.repository.GamePropertiesRepository;
import com.gameapi.gameapi.service.GamePropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamePropertiesServiceImpl implements GamePropertiesService {
    @Autowired
    private GamePropertiesRepository gamePropertiesRepository;
    @Override
    public GameProperties saveGameProperties(GameProperties gameProperties) {
        GameProperties savedGameProperties = gamePropertiesRepository.save(gameProperties);
        return savedGameProperties;
    }
}
