package boardgame;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private Peca[][] pecas;//Matriz de peças
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];//instanciando a matriz de pecas com quantidade de linha e coluna informados
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
}
