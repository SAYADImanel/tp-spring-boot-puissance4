package com.igs.ipi.tpspringbootsayadi.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.igs.ipi.tpspringbootsayadi.service.GameService;
import com.igs.ipi.tpspringbootsayadi.model.GameModel;
import com.igs.ipi.tpspringbootsayadi.service.PartieEnCours;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class GameController {

    private GameService gameService;
    private PartieEnCours partieEnCours;

    public GameController(GameService gameService, PartieEnCours partieEnCours) {
        this.gameService = gameService;
        this.partieEnCours = partieEnCours;
    }


    @RequestMapping("/game/new")
    public ModelAndView newGame() {
        ModelAndView mv = new ModelAndView("game");
        GameModel gameModel = gameService.newGame();
        partieEnCours.setGameModel(gameModel);
        mv.addObject("game", gameModel);
        return mv;
    }


    @RequestMapping("/game")
    public ModelAndView game() {
        ModelAndView mv = new ModelAndView("game");
        GameModel gameModel = partieEnCours.getGameModel();
        mv.addObject("game", gameModel);
        return mv;

    }

    @RequestMapping("/game/drop/{i}")
    public ModelAndView drop(@PathVariable("i") Integer numColonne) {
        ModelAndView mv = new ModelAndView("game");
        GameModel gameModel = partieEnCours.getGameModel();
        int index = numColonne - 1;
        gameModel.add(index);
        mv.addObject("game", gameModel);
        return mv;
    }
}





