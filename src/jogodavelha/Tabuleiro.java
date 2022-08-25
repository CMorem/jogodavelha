package jogodavelha;

import java.util.Random;

public class Tabuleiro {
	
	char [] tab = new char[9];
    int ocup =0; // numero de posiçoes ocupadas
    public Tabuleiro(){ // Construtor
    for(int i=0;i<9;i++)
      tab[i]=' ';
    ocup=0;
  }
    

    
    public char escolherPeca(){
	Random a = new Random(); 
	if (a.nextInt(2)>=1)
	    return 'X';
	return 'O';
    }

    public char pecaAdversario(char ch){
	if (ch=='X')
	    return 'O';
	return 'X';
    }
	
  public void imprimirTabuleiro(){
    System.out.println("Tabuleiro atualmente: ");
    System.out.println(tab[0]+"|"+tab[1]+"|"+tab[2]);
    System.out.println("-----");
    System.out.println(tab[3]+"|"+tab[4]+"|"+tab[5]);
    System.out.println("-----");
    System.out.println(tab[6]+"|"+tab[7]+"|"+tab[8]);
    System.out.println();
  }
  public boolean jogadaValida(int i, char ch){
    if ((i<0)||(i>8)||(tab[i]!=' '))
      return false; // caso a jogada seja inválida retorna falso
    else {
      tab[i]=ch;
      ocup++;
    }
    return true;
  }
  public void voltaJogada(int i){
      tab[i]=' ';// limpa a posição i
      ocup--;
  }
  public char quemGanhou(){
    if ((tab[0]=='X')&&(tab[1]=='X')&&(tab[2]=='X')||
        (tab[3]=='X')&&(tab[4]=='X')&&(tab[5]=='X')|| // linhas
	(tab[6]=='X')&&(tab[7]=='X')&&(tab[8]=='X')||
	(tab[0]=='X')&&(tab[3]=='X')&&(tab[6]=='X')||
        (tab[1]=='X')&&(tab[4]=='X')&&(tab[7]=='X')|| // colunas
	(tab[2]=='X')&&(tab[5]=='X')&&(tab[8]=='X')||
	(tab[0]=='X')&&(tab[4]=='X')&&(tab[8]=='X')|| //diagonais
	(tab[6]=='X')&&(tab[4]=='X')&&(tab[2]=='X'))
	return 'X';
    if ((tab[0]=='O')&&(tab[1]=='O')&&(tab[2]=='O')||
        (tab[3]=='O')&&(tab[4]=='O')&&(tab[5]=='O')|| // MAPEAMENTO
	(tab[6]=='O')&&(tab[7]=='O')&&(tab[8]=='O')||
	(tab[0]=='O')&&(tab[3]=='O')&&(tab[6]=='O')||
        (tab[1]=='O')&&(tab[4]=='O')&&(tab[7]=='O')||
	(tab[2]=='O')&&(tab[5]=='O')&&(tab[8]=='O')||
	(tab[0]=='O')&&(tab[4]=='O')&&(tab[8]=='O')|| 
	(tab[6]=='O')&&(tab[4]=='O')&&(tab[2]=='O'))
	return 'O';
    return ' ';
  }
  public boolean finalJogo(){
    if (ocup==9) // tabuleiro todo ocupado
      return true;
    if (quemGanhou()!=' ') // alguem ganhou
      return true;
    return false;
  }
}
interface Jogador{
    public void efetuaJogada(Tabuleiro t);
}


