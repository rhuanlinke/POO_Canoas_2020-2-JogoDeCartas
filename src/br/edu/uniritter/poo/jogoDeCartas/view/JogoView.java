package br.edu.uniritter.poo.jogoDeCartas.view;

import br.edu.uniritter.poo.controller.JogoController;
import br.edu.uniritter.poo.jogoDeCartas.model.Lixo;

import java.util.Scanner;

public class JogoView {
    private JogoController controller;

    public JogoView(JogoController controller) {
        this.controller  = controller;
    }

    public void mostraLixo(Lixo lixo) {
        System.out.println("L I X O");
        System.out.println("+++++++");
        if (lixo.estaVazio()) {
            System.out.println(" VAZIO NO MOMENTO");
        } else {
            //System.out.println("a carta � surpresa");
            System.out.println(lixo.cartaDeCima().getDescricao());
        }
    }
    public void ondeComprar() {
        System.out.println("Voc� quer comprar do: \n(1) Baralho \n(2) Lixo");
        int resp = 0;
        Scanner scan = new Scanner(System.in);
        do {
            resp = scan.nextInt();
        }while (resp<1 || resp > 2);
        controller.escolhaCompraJogador(resp);

    }
}
