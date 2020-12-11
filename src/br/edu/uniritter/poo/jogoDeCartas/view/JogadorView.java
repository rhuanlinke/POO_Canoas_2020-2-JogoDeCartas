package br.edu.uniritter.poo.jogoDeCartas.view;

import br.edu.uniritter.poo.controller.JogoController;
import br.edu.uniritter.poo.jogoDeCartas.model.Jogador;

import java.util.Scanner;

public class JogadorView {
    private JogoController controller;

    public JogadorView(JogoController controller) {
        this.controller  = controller;
    }
    public void mostraMao(Jogador jog) {
        System.out.println(jog.toString());
    }
    public void escolheCartaDescartar(Jogador jog) {
        for (int i  = 0; i < jog.getMao().size(); i++) {
            System.out.println((i+1)+" - "+jog.getMao().get(i).getDescricao());
        }
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Qual carta a descartar?");
			int resp = 0;
			do {
			    resp = scan.nextInt();
			    resp--;
			} while (resp < 1 || resp > jog.getMao().size());
			controller.escolhaDescarteJogador(resp);
		}
    }
    public int quantosJogadores() {
    	System.out.println("Quantos jogadores serão?");
    	Scanner scan = new Scanner(System.in);
		int nroJogadores = scan.nextInt();
		return nroJogadores;
    }
    
    public void nomeJogador() {
    	System.out.println("Qual o nome do jogador?");
    }
}
