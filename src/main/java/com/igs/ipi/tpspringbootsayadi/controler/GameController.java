package com.igs.ipi.tpspringbootsayadi.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.igs.ipi.tpspringbootsayadi.service.GameService;
import com.igs.ipi.tpspringbootsayadi.model.GameModel;
@Controller
public class GameController {

    private GameService gameService ;

    public GameController(GameService gameService) {
               this.gameService = gameService;
          }

    @RequestMapping("/game/new")
    public ModelAndView newGame() {
        ModelAndView mv = new ModelAndView("game");
        GameModel gameModel = gameService.newGame();
        mv.addObject("game", gameModel);
        return mv;
    }
}





