package com.igs.ipi.tpspringbootsayadi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameControler {
    @GetMapping("/game/new")
    public ModelAndView newgame (){
        ModelAndView mv= new ModelAndView("game");
        return mv;


    }
}
