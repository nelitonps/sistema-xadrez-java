package Chess.pecas;

import Chess.Cor;
import Chess.PecadeXadrez;
import boardgame.Tabuleiro;

public class Rei extends PecadeXadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	public String toString() {
		return "R";
	}

}
