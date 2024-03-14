package com.lobotomycardgame.gamecore.controller.ui;


import com.lobotomycardgame.gamecore.models.Card;
import com.lobotomycardgame.gamecore.models.UnitCard;
import org.springframework.stereotype.Component;

@Component
public class AsciiUserInterface {

    public String characterLine(String character, int lineSize){
        String characterLine = "";

        for (int i = 0; i<lineSize; i++){
            characterLine+=character;
        }

        return characterLine;
    }

    public String printUnitCard( UnitCard card){



        String asciiCard ="";

        int titleformat = (24-card.getName().length())/2;



        asciiCard +=characterLine("*",titleformat)
                +card.getName()+characterLine("*",titleformat)+"\n";
        asciiCard +=characterLine("*",23) + card.getCost()+"\n";
        asciiCard +="* Attack: "+card.getAttack()+" Defense: "+card.getDefense()+"* \n";

        return asciiCard;


    }

}
