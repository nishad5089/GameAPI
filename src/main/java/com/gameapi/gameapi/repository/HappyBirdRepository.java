package com.gameapi.gameapi.repository;

import com.gameapi.gameapi.entity.Emoji;
import com.gameapi.gameapi.entity.HappyBird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HappyBirdRepository extends JpaRepository<HappyBird,Long> {

}