package Chess;

import Chess.pecas.Rei;
import Chess.pecas.Torre;
import boardgame.Tabuleiro;

public class PartidadeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public PecadeXadrez[][] getPecas(){//retorna uma matriz de peças de xadres correspondente a essa partida
		PecadeXadrez[][] mat = new PecadeXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for (int i=0; i<tabuleiro.getLinha(); i++) {
			for (int j=0; j<tabuleiro.getColuna(); j++) {
				mat[i][j] = (PecadeXadrez)tabuleiro.peca(i, j);
			}
		}
		
		return mat;
	}
	
	private void novaPeca(char coluna, int linha, PecadeXadrez peca) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void iniciarPartida() {
		
		novaPeca('C', 1, new Torre(tabuleiro, Cor.Branco));
		novaPeca('C', 2, new Torre(tabuleiro, Cor.Branco));
		novaPeca('D', 2, new Torre(tabuleiro, Cor.Branco));
		novaPeca('E', 2, new Torre(tabuleiro, Cor.Branco));
		novaPeca('E', 1, new Torre(tabuleiro, Cor.Branco));
		novaPeca('D', 1, new Rei(tabuleiro, Cor.Branco));

		novaPeca('C', 7, new Torre(tabuleiro, Cor.Preto));
		novaPeca('C', 8, new Torre(tabuleiro, Cor.Preto));
		novaPeca('D', 7, new Torre(tabuleiro, Cor.Preto));
		novaPeca('E', 7, new Torre(tabuleiro, Cor.Preto));
		novaPeca('E', 8, new Torre(tabuleiro, Cor.Preto));
		novaPeca('D', 8, new Rei(tabuleiro, Cor.Preto));
	}
}
