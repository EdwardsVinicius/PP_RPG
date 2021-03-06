package game.model;
import game.interfaces.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal {
	private String nome;
	
	public Personagem(String _nome) {
		setNome(_nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void andar();
	
	public abstract void guardarItem();
	
	public abstract void usarItem();
	
	
}
