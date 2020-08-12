package com.gameapi.gameapi.service.Impl;

import com.gameapi.gameapi.entity.Emoji;
import com.gameapi.gameapi.repository.EmojiRepository;
import com.gameapi.gameapi.service.EmojiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmojiServiceImpl implements EmojiService {
    @Autowired
    private EmojiRepository emojiRepository;
    @Override
    public Emoji saveEmoji(Emoji emoji) {
        Emoji savedEmoji = emojiRepository.save(emoji);
        return savedEmoji;
    }
}
