package com.P95.game_library.Service;

import com.P95.game_library.Model.Game;
import com.P95.game_library.Model.GameStatus;
import com.P95.game_library.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository  gameRepository;

    //adicionar jogo
    public Game adicionarJogo(Game game){
        return gameRepository.save(game);
    }

    //listar jogos
    public List<Game> listarJogos(){
        return gameRepository.findAll();
    }

    //Listar status dos jogos
    public List<Game> listarJogosByStatus(GameStatus status){return gameRepository.findByStatus(status);}
}
