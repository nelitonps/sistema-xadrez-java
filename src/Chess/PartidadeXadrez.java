package Chess;

import boardgame.Tabuleiro;

public class PartidadeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
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
}
