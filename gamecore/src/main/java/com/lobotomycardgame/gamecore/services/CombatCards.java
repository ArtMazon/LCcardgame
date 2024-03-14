package com.lobotomycardgame.gamecore.services;

import com.lobotomycardgame.gamecore.models.UnitCard;
import org.springframework.stereotype.Service;

@Service
public class CombatCards {

    public UnitCard fight(UnitCard attacker,UnitCard defender){

        if(attacker.getAttack() == defender.getDefense()){
            return null;
        }

        return  attacker.getAttack() > defender.getDefense() ? attacker : defender;

    }
}
