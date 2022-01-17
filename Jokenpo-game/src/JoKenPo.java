
import java.util.Random;
import java.util.Scanner;

import com.jokenpo.model.Jogador;

public class JoKenPo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("================ JoKenPo ================");
		System.out.println(" ");
		System.out.print("0. Pedra /"); // Tesoura (Perde) e Papel (Perde)
		System.out.print(" 1. Papel /"); // Tesoura (vence) e Pedra (Perde)
		System.out.println(" 2. Tesoura"); // Pedra (Vence) e Tesoura (Perde)
		System.out.print("Digite a opção desejada: ");

		Jogador player1 = new Jogador("player1");
		int jogador = scanner.nextInt();

		int computador = random.nextInt(3);

		switch (jogador) {
		case 0:
			player1.jogar(0);
			break;
		case 1:
			player1.jogar(1);
			break;
		case 2:
			player1.jogar(2);
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}

		// Computador escolheu!!!

		if (computador == 0) {
			System.out.println("O computador escolheu Pedra");
		}
		if (computador == 1) {
			System.out.println("O computador escolheu Papel");
		}
		if (computador == 2) {
			System.out.println("O computador escolheu Tesoura");
		}

		// Vencedor!!!

		if (jogador == 0 && computador == 2) {
			System.out.println("Jogador ganhou!!!");
		}

		if (jogador == 1 && computador == 0) {
			System.out.println("Jogador ganhou!!!");
		}

		if (jogador == 2 && computador == 1) {
			System.out.println("Jogador ganhou!!!");
		}

		if (jogador == 1 && computador == 2) {
			System.out.println("Computador ganhou!!!");
		}

		if (jogador == 2 && computador == 0) {
			System.out.println("Computador ganhou!!!");
		}

		if (jogador == 0 && computador == 1) {
			System.out.println("Computador ganhou!!!");
		}

		if (jogador == 1 && computador == 1) {
			System.out.println("empatou!!!");
		}

		if (jogador == 2 && computador == 2) {
			System.out.println("empatou!!!");
		}

		if (jogador == 0 && computador == 0) {
			System.out.println("empatou!!!");
		}

		scanner.close();

	}
}
