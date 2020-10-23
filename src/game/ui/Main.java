package game.ui;

import java.util.ArrayList;

import game.controller.Jogo;
import game.logic.Cavaleiro;
import game.logic.Dragao;
import game.logic.Mago;
import game.model.Personagem;

public class Main {

	public static void main(String[] args) {
		
		Jogo jogo = new Jogo();
		
		ArrayList<Personagem> personagens = new ArrayList<>();
		
		Cavaleiro frog = new Cavaleiro("Frog");
		Cavaleiro link = new Cavaleiro("Link");
		
		Mago gandalf = new Mago("Gandalf");
		Mago magus = new Mago("Magus");
		
		Dragao smaug = new Dragao("Smaug");
		Dragao tiamat = new Dragao("Tiamat");
		
		personagens.add(frog);
		personagens.add(link);
		personagens.add(gandalf);
		personagens.add(magus);
		personagens.add(smaug);
		personagens.add(tiamat);
		
		jogo.ControlarAcoesDosPersonagens(frog);
		jogo.ControlarAcoesDosPersonagens(link);
		
		jogo.ControlarAcoesDosPersonagens(gandalf);
		jogo.ControlarAcoesDosPersonagens(magus);
		
		jogo.ControlarAcoesDosPersonagens(smaug);
		jogo.ControlarAcoesDosPersonagens(tiamat);
		
		
		

	}

}
