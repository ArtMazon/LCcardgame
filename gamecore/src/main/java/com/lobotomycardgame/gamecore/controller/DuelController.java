package com.lobotomycardgame.gamecore.controller;


import com.lobotomycardgame.gamecore.controller.ui.AsciiUserInterface;
import com.lobotomycardgame.gamecore.models.UnitCard;
import com.lobotomycardgame.gamecore.services.CombatCards;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class DuelController {

    private Logger logger = Logger.getLogger(DuelController.class.getName());

    private final AsciiUserInterface asciiUI;
    private final CombatCards combatCards;

    public DuelController(
            AsciiUserInterface asciiUI,
            CombatCards combatCards
    ){
        this.asciiUI = asciiUI;
        this.combatCards = combatCards;
    }




    @GetMapping("/test")
    public void test(){
        UnitCard Agent1 = new UnitCard("Agent1",10,9);
        UnitCard Agent2 = new UnitCard("Agent2",12,11);


        logger.info("\n Attacker \n"+asciiUI.printUnitCard(Agent1));
        logger.info("\n Defender \n"+asciiUI.printUnitCard(Agent2));

        UnitCard result = combatCards.fight(Agent1,Agent2);

        if (result == null){
            logger.info("\n It's a Draw , both died!");
        }else {
            logger.info("\n Winner \n"+asciiUI.printUnitCard(result));

        }


    }








}
