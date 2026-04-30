package com.P95.game_library.Service;

import com.P95.game_library.Model.Game;
import com.P95.game_library.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository  gameRepository;

    public Game adicionarJogo(Game game){
        return gameRepository.save(game);
    }

    public List<Game> listarjogos(){
        return gameRepository.findAll();
    }
}
