package com.igs.ipi.tpspringbootsayadi.service;
import com.igs.ipi.tpspringbootsayadi.model.GameModel;
import org.springframework.stereotype.Service;
@Service
public class GameService {


    public GameModel  newGame() {
        GameModel game = new GameModel();
        game.setNom1("manel");
        game.setNom2("emelyne");
        return game;

    }


}
