package com.jokenpo.model;

public class Jogador implements Jogar {
	
	
	private String jogador;
	
	public Jogador(String jogador) {
		this.jogador = jogador;
	}
	public String getJogador() {
		return jogador;
	}
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	
	@Override
	public String jogar(int i) {
		
		// Jogador escolheu !!!

		switch (i) {
		case 0:
			this.setJogador("Pedra");
			System.out.println("Jogador escolheu Pedra");
			break;

		case 1:
			this.setJogador("Papel");
			System.out.println("Jogador escolheu Papel");
			break;

		case 2:
			this.setJogador("Tesoura");
			System.out.println("Jogador escolheu Tesoura");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		
		return jogador;
	}
	@Override
	public void jogar() {
		// TODO Auto-generated method stub
		
	}

}
