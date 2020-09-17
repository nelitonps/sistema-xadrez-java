package application;

import java.util.Scanner;

import Chess.PartidadeXadrez;
import Chess.PecadeXadrez;
import Chess.XadrezPosicao;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		PartidadeXadrez partida = new PartidadeXadrez();
		
		while(true) {
			UI.imprimeTabuleiro(partida.getPecas());//imprime tabuleiro na tela
			System.out.println();
			System.out.print("Origem: ");
			XadrezPosicao origem = UI.lerPosicaoXadrez(sc);//lendo posição de origem
			
			System.out.println();
			System.out.print("Destino: ");
			XadrezPosicao destino = UI.lerPosicaoXadrez(sc);//lendo posição de origem
			
			PecadeXadrez capituraPeca = partida.movimentoXadrez(origem, destino);
			
		}
	}

}
