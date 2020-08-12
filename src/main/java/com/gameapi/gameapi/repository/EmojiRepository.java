package com.gameapi.gameapi.repository;

import com.gameapi.gameapi.entity.Emoji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmojiRepository extends JpaRepository<Emoji,Long> {

}
