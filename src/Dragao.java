
public class Dragao extends Personagem implements ComportamentoFeroz {

	public Dragao(String nome) {
		super(nome);
	}

	@Override
	public void ativarFogo() {
		System.out.println("Drag�o " + this.getNome() + " est� cuspindo fogo.");

	}

	@Override
	public void voar() {
		System.out.println("Drag�o " + this.getNome() + " est� voando.");

	}

	@Override
	public void morder() {
		System.out.println("Drag�o " + this.getNome() + " usou mordida.");

	}

	@Override
	public void andar() {
		System.out.println("Drag�o " + this.getNome() + " est� andando.");

	}

	@Override
	public void guardarItem() {
		System.out.println("Drag�o " + this.getNome() + " guardou um item...?");

	}

	@Override
	public void usarItem() {
		System.out.println("Drag�o " + this.getNome() + " usou um item...?");

	}

}
