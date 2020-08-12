package com.gameapi.gameapi.service.Impl;

import com.gameapi.gameapi.entity.HappyBird;
import com.gameapi.gameapi.repository.HappyBirdRepository;
import com.gameapi.gameapi.service.HappyBirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HappyBirdServiceImpl implements HappyBirdService
{
    @Autowired
    private HappyBirdRepository happyBirdRepository;
    @Override
    public HappyBird saveHappyBird(HappyBird happyBird) {
        return happyBirdRepository.save(happyBird);
    }
}
