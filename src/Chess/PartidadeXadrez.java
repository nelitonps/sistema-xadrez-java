package Chess;

import Chess.pecas.Rei;
import Chess.pecas.Torre;
import boardgame.Posicao;
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
	
	private void iniciarPartida() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.Branco), new Posicao(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.Preto), new Posicao(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.Branco), new Posicao(7, 4));

	}
}
