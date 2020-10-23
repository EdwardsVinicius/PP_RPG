package game.controller;

import game.logic.Cavaleiro;
import game.logic.Dragao;
import game.logic.Mago;

public class Jogo {

	public Jogo() {
		// TODO Auto-generated constructor stub
	}

	public void ControlarAcoesDosPersonagens(Cavaleiro cavaleiro) {
		cavaleiro.andar();
		cavaleiro.guardarItem();
		cavaleiro.usarItem();
	}
	
	public void ControlarAcoesDosPersonagens(Mago mago) {
		mago.andar();
		mago.guardarItem();
		mago.usarItem();
	}

	public void ControlarAcoesDosPersonagens(Dragao dragao) {
		dragao.andar();
		dragao.guardarItem();
		dragao.usarItem();
	}
}
