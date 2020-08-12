package com.gameapi.gameapi.repository;

import com.gameapi.gameapi.entity.GameStartAndEnd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStartAndEndRepository extends JpaRepository<GameStartAndEnd,Long> {

}