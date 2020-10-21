package game.logic;
import game.ui.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico {

	public Mago(String nome) {
		super(nome);
	}

	@Override
	public void invisibilidade() {
		System.out.println("Mago " + this.getNome() + " está invisível.");

	}

	@Override
	public void ultraRapidez() {
		System.out.println("Mago " + this.getNome() + " ESTÁ ULTRA RÁPIDO.");

	}

	@Override
	public void andar() {
		System.out.println("Mago " + this.getNome() + " está andando.");

	}

	@Override
	public void guardarItem() {
		System.out.println("Mago " + this.getNome() + " guardou item.");

	}

	@Override
	public void usarItem() {
		System.out.println("Mago " + this.getNome() + " usou item.");

	}

}
