package com.P95.game_library.Repository;

import com.P95.game_library.Model.Game;
import com.P95.game_library.Model.GameStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByStatus(GameStatus status);
}
