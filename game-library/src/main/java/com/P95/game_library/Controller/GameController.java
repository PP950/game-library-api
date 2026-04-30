package com.P95.game_library.Controller;

import com.P95.game_library.Model.Game;
import com.P95.game_library.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping
    public Game save(@RequestBody Game game) {
        Game jogosalvo = gameService.adicionarJogo(game);
        return jogosalvo;
    }

    @GetMapping
    public List<Game> getAll() {
        return gameService.listarjogos();
    }
}
