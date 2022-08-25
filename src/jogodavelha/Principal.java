package jogodavelha;

public class Principal {

	public static void main(String[] args) {
		 Tabuleiro t = new Tabuleiro();
		    Jogador j1,j2;
		    char ch=t.escolherPeca();
		    j1 = new Humano(ch);
		    j2 = new Computador(t.pecaAdversario(ch));
		    Jogador atual;
		    System.out.println("!!!!!Jogo da Velha contra o Computador!!!!!");
		    System.out.println("O jogador que for sorteado com o X começa!");
		    System.out.println("Segundo o sorteio você é o: "+ch);
		    System.out.println("Escolha um quadrado conforme o exibido abaixo: ");
		    System.out.println("0|1|2");
		    System.out.println("-----");
		    System.out.println("3|4|5");
		    System.out.println("-----");
		    System.out.println("6|7|8");
		    System.out.println("");
		    if (ch=='X') // Começa jogando o jogador com o X
			atual = j1;
		    else
			atual = j2;
		    while (!t.finalJogo()){
		      atual.efetuaJogada(t);
		      t.imprimirTabuleiro();
		      if (atual==j1) 
			atual=j2;
		      else
			atual=j1;
		    }
		    t.imprimirTabuleiro();
		    if (t.quemGanhou()==' ')
		      System.out.println("Empatou");
		    else
		      System.out.println("O vencedor é: "+t.quemGanhou());
		  }

	}


