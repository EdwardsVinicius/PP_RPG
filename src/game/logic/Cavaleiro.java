package game.logic;
import game.ui.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
	
	public Cavaleiro(String nome) {
		super(nome);
	}


	@Override
	public void atacar() {
		System.out.println("Cavaleiro " + this.getNome() + " atacou.");

	}

	@Override
	public void defender() {
		System.out.println("Cavaleiro " + this.getNome() + " está defendendo.");

	}

	@Override
	public void saltar() {
		System.out.println("Cavaleiro " + this.getNome() + " saltou.");

	}

	@Override
	public void andar() {
		System.out.println("Cavaleiro " + this.getNome() + " está andando.");
		
	}
	
	@Override
	public void guardarItem() {
		System.out.println("Cavaleiro " + this.getNome() + " guardou item.");
		
	}
	
	@Override
	public void usarItem() {
		System.out.println("Cavaleiro " + this.getNome() + " usou item.");
		
	}
}
