package com.igs.ipi.tpspringbootsayadi.service;
import com.igs.ipi.tpspringbootsayadi.model.GameModel;
import org.springframework.stereotype.Service;
@Service
public class GameService {


    public GameModel  newGame() {
        GameModel gameModel = new GameModel();
        gameModel.setNom1("manel");
        gameModel.setNom2("emelyne");
        return gameModel;

    }


}
