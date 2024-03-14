package com.lobotomycardgame.gamecore;

import com.lobotomycardgame.gamecore.controller.DuelController;
import com.lobotomycardgame.gamecore.controller.ui.AsciiUserInterface;
import com.lobotomycardgame.gamecore.models.UnitCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GamecoreApplication{


	public static void main(String[] args) {

		SpringApplication.run(GamecoreApplication.class, args);


	}


}
