package jogodavelha;

import java.io.DataInputStream;

public class Leitura {
	//para leitura de números inteiros	
	private static void error(String tipo){
      	System.err.println("LeituraJogoDeTrilha: Erro ao tentar ler "+tipo+"."+
			   " Por favor redigite.");
    }
    public static int leInt()
    {	do  try{ return(Integer.parseInt((new DataInputStream(System.in)).readLine())); }
	    catch(Exception e){ error("int"); }
	while(true);
    }

}
