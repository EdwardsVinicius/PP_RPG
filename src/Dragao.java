
public class Dragao extends Personagem implements ComportamentoFeroz {

	public Dragao(String nome) {
		super(nome);
	}

	@Override
	public void ativarFogo() {
		System.out.println("Dragão " + this.getNome() + " está cuspindo fogo.");

	}

	@Override
	public void voar() {
		System.out.println("Dragão " + this.getNome() + " está voando.");

	}

	@Override
	public void morder() {
		System.out.println("Dragão " + this.getNome() + " usou mordida.");

	}

	@Override
	public void andar() {
		System.out.println("Dragão " + this.getNome() + " está andando.");

	}

	@Override
	public void guardarItem() {
		System.out.println("Dragão " + this.getNome() + " guardou um item...?");

	}

	@Override
	public void usarItem() {
		System.out.println("Dragão " + this.getNome() + " usou um item...?");

	}

}
