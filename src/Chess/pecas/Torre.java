package Chess.pecas;

import Chess.Cor;
import Chess.PecadeXadrez;
import boardgame.Tabuleiro;

public class Torre extends PecadeXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "T";
	}
	
}
