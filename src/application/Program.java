package application;

import Chess.PartidadeXadrez;
import boardgame.Tabuleiro;

public class Program {

	public static void main(String[] args) {
	
		PartidadeXadrez partida = new PartidadeXadrez();
		UI.imprimeTabuleiro(partida.getPecas());
	}

}
