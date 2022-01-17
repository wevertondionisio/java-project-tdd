package com.jokenpo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.jokenpo.model.Computador;
import com.jokenpo.model.Jogador;

public class JoKenPoTest {
	
	private Jogador jogador;
	
	@Before
	public void setup() {
		jogador = new Jogador(null);
	}
	
	@Test
	public void jogadorDeveEscolherPedra() throws Exception {
		jogador = new Jogador("player1");
		String i = jogador.jogar(0);
		
		assertEquals("Pedra", i);
	}
	
	@Test
	public void JogadorDeveEscolherPapel() throws Exception {
		jogador = new Jogador("player1");
		String i = jogador.jogar(1);
		
		assertEquals("Papel", i);
	}
	
	@Test
	public void JogadorDeveEscolherTesoura() throws Exception {
		jogador = new Jogador("player1");
		String i = jogador.jogar(2);
		
		assertEquals("Tesoura", i);
	}

}