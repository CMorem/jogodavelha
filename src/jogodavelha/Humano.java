package jogodavelha;

public class Humano implements Jogador {
	
	
	char tipo;
	  public Humano(char ch){ //construtor do jogador
	    tipo = ch;
	  }
	  public void efetuaJogada(Tabuleiro t){
	    int num;
	    System.out.println("Caro jogador: "+tipo+" entre com um numero entre 0 e 8");
	    num=Leitura.leInt();
	    while(!t.jogadaValida(num, tipo)){
		System.out.println("Por favor tente novamente");
		num=Leitura.leInt();
	    }
	  }
}
