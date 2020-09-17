package Chess;

import boardgame.Posicao;

public class XadrezPosicao {

	private char coluna;
	private int linha;
	
	public XadrezPosicao(char coluna, int linha) {
		if(coluna < 'A' || coluna > 'H' || linha < 1 || linha > 8) {
			throw new XadrezException("Parametros incorretos, valores validos de A1 ate H8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao toPosicao() {//retorna uma nova posição
		return new Posicao(8 - linha, coluna - 'A');
	}
	
	protected static XadrezPosicao fromPosicao(Posicao posicao) {//retorna uma nova posição
		return new XadrezPosicao((char)('A' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
