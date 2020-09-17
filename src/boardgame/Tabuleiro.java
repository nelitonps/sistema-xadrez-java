package boardgame;

public class Tabuleiro {

	private int linha;
	private int coluna;
	private Peca[][] pecas;//Matriz de peças
	
	public Tabuleiro(int linha, int coluna) {
		if(linha < 1 || coluna < 1) {
			throw new TabuleiroException("Erro criando tabuleiro, é necessario que haja pelo menos 1 linha e 1 coluna");
		}
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];//instanciando a matriz de pecas com quantidade de linha e coluna informados
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public Peca peca(int lin, int col) {
		if(!posicaoExistente(lin, col)){
			throw new TabuleiroException("Posição não encontrada no tabuleiro");
		}
		return pecas[lin][col];
	}
	
	public Peca peca(Posicao posicao) {//Sobrecarga do metodo peca
		if(!posicaoExistente(posicao)){
			throw new TabuleiroException("Posição não encontrada no tabuleiro");
		}

		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(pecaExistente(posicao)) {
			throw new TabuleiroException("Existe peça nesta posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	public Peca removePeca(Posicao posicao) {
		if(!posicaoExistente(posicao)){
			throw new TabuleiroException("Posição não encontrada no tabuleiro");
		}
		
		if(peca(posicao) == null) {
			return null;
		}
		
		Peca aux = peca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
	}
	
	public boolean posicaoExistente(int lin, int col) {//metodo auxiliar
		return lin >=0 && lin < linha && col >=0 && col < coluna;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean pecaExistente(Posicao posicao) {
		if(!posicaoExistente(posicao)){
			throw new TabuleiroException("Posição não encontrada no tabuleiro");
		}

		return peca(posicao) != null;
	}
}
