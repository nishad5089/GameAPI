package com.gameapi.gameapi.repository;

import com.gameapi.gameapi.entity.Emoji;
import com.gameapi.gameapi.entity.GameProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePropertiesRepository extends JpaRepository<GameProperties,Long> {
}
