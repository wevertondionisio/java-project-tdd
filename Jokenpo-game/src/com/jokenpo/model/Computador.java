package com.jokenpo.model;

 
import java.util.Random;

public class Computador implements Jogar {
	
	private String computador;
	
	public Computador(String computador) {
		super();
		this.computador = computador;
	}
	public String getComputador() {
		return computador;
	}
	public void setComputador(String computador) {
		this.computador = computador;
	}
	
	@Override
	public void jogar() {
		
		Random random = new Random();
		String [] mao = {"pedra", "papel", "tesoura"};
		
		int escolha;
		
		escolha = random.nextInt(3);
		this.computador = mao[escolha];
		
		if (escolha == 0) {
			System.out.println("O computador escolheu Pedra");
		}
		if (escolha == 1) {
			System.out.println("O computador escolheu Papel");
		}
		if (escolha == 2) {
			System.out.println("O computador escolheu Tesoura");
		}
		
	}
	@Override
	public String jogar(int i) {
		// TODO Auto-generated method stub
		return "Pedra";
	}
	
}
