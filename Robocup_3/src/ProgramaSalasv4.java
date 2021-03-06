import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.UIManager;
import java.awt.*;

import java.util.Scanner;

public class ProgramaSalasv4
{
	static String sala =""; 
	static StringBuffer strSalas = new StringBuffer();
	static int tamanhoMaior= 0;
	static int tamanho =0;
	static int qtListas=0;

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		telaInicial();
		teclado.close();
	}
	
	//ESCOLHA DAS OP��ES DO PROGRAMA
	public static void telaInicial() {
		
		UIManager.put("OptionPane.minimumSize", new Dimension(600, 100));// tamanho minimo da tela
		UIManager.put("OptionPane.buttonPadding", 1);//espa�o entre os botoes
		int escolha; //resposta do usu�rio
		
				do {
					Object opcoes[] = { "Criar lista", 
										"Ter rela��o de salas",
										"Sair"};
					
					escolha = JOptionPane.showOptionDialog(null, 
													"O que deseja fazer agora?", 
													"Escolha!", 
													JOptionPane.YES_NO_OPTION, 
													JOptionPane.QUESTION_MESSAGE, 
													null, 
													opcoes, 
													opcoes[0]);
					

					if(escolha == 0) {
						escolherAndar();
					}
					
					if(escolha == 1)
					{
						criarListaUnica();
					}
				}while(escolha != 2);
				
				if(escolha == 2) {
					System.exit(0);
				}
	}
	
	//ESCOLHER ANDAR
	public static void escolherAndar() {
   
		Object opcoes[] = { "Primeiro Andar", 
				"Segundo Andar", 
				"Terceiro Andar",
				"Quarto Andar",
				"Quinto Andar",
				"Sexto Andar"
				};
		

		int andar = JOptionPane.showOptionDialog(null, 
				"Escolha um andar abaixo", 
				"Escolha!", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, 
				opcoes, 
				opcoes[0]);
		
		adicionarLista(andar);
	}
	
	//LEVA OS DADOS PARA O M�TODO mostrarDialogo Salas
	//ANALISA OS DADOS OBTIDOS DA FUN��O(salas escolhidas ou op��o desejada pelo usu�rio)
	public static void adicionarLista(int andar) {

		int opcaoEscolhida = 0;
		int opcaoEscolhida6 = 0;
		int salaEscolhida = 0;
		
		int cancelar = 17;
		int andares = 18;
		int salvar = 19;
		
		
		switch(andar) {
		case 0:
			do {
				opcaoEscolhida = mostrarDialogoSalas(andar, sala);
				
				if(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar) {
					salaEscolhida = opcaoEscolhida + 1;
					sala= sala + salaEscolhida+" ";
					tamanho++;
				}
				
			}while(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar);
			break;
			
		case 1:
			do{
				opcaoEscolhida = mostrarDialogoSalas(andar, sala);
				
				if(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar) {
					salaEscolhida = opcaoEscolhida + 18;
					sala= sala + salaEscolhida+" ";
					tamanho++;
				}
			}while(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar);

			break;
			
		case 2:
			do{
				opcaoEscolhida = mostrarDialogoSalas(andar, sala);
				
				if(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar) {
					salaEscolhida = opcaoEscolhida + 35;
					sala= sala + salaEscolhida+" ";
					tamanho++;
				}
			}while(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar);
			break;
			
		case 3:
			do{
				
				opcaoEscolhida = mostrarDialogoSalas(andar, sala);
				
				if(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar) {
					salaEscolhida = opcaoEscolhida + 52;
					sala= sala + salaEscolhida+" ";
					tamanho++;
				}
			}while(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar);
			break;
			
		case 4:
			do{
				
				opcaoEscolhida = mostrarDialogoSalas(andar, sala);
				
				if(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar) {
					salaEscolhida = opcaoEscolhida + 69;
					sala= sala + salaEscolhida+" ";
					tamanho++;
				}
			}while(opcaoEscolhida != cancelar && opcaoEscolhida != andares && opcaoEscolhida != salvar);
			break;
			
		case 5:
			do{
				cancelar = 14;
				andares = 15;
				salvar = 16;
				
				opcaoEscolhida6 = mostrarDialogoSalas(andar, sala);
				
				if(opcaoEscolhida6 != cancelar && opcaoEscolhida6 != andares && opcaoEscolhida6 != salvar) {
					salaEscolhida = opcaoEscolhida6 + 86;
					sala= sala + salaEscolhida+" ";
					tamanho++;
				}
			}while(opcaoEscolhida6 != cancelar && opcaoEscolhida6 != andares && opcaoEscolhida6 != salvar);
			break;
		}
		
		if(opcaoEscolhida == cancelar || opcaoEscolhida6 == cancelar) {//CANCELAR
			sala = "";
			tamanho = 0;
			telaInicial();
		}
		
		if(opcaoEscolhida == andares || opcaoEscolhida6 == andares) { //ESCOLHER MAIS UM ANDAR
			escolherAndar();
		}

		if(opcaoEscolhida == salvar || opcaoEscolhida6 == salvar) { //SALVAR LISTA
			if(tamanho < 5) {
				JOptionPane.showMessageDialog(null, "Adicione mais "+(5-tamanho)+" salas, no m�nimo, para completar a lista!");
				escolherAndar();
			}
			salvarLista(sala);
		}
		
		JOptionPane.showMessageDialog(null, sala);
		
	}
	
	//APRSENTA A TELA DAS SALAS DE ACORDO COM O ANDAR SELECIONADO
	public static int mostrarDialogoSalas(int andar, String salas) {

		int opcaoEscolhida = 0;
		
		Object opcoes1[] = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","Cancelar", "Andares", "Salvar"};
		Object opcoes2[] = {"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","Cancelar", "Andares", "Salvar"};
		Object opcoes3[] = {"35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","Cancelar", "Andares", "Salvar"};
		Object opcoes4[] = {"52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","Cancelar", "Andares", "Salvar"};
		Object opcoes5[] = {"69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","Cancelar", "Andares", "Salvar"};
		Object opcoes6[] = {"86","87","88","89","90","91","92","93","94","95","96","97","98","99","Cancelar", "Andares", "Salvar"};
		
		if(andar == 0) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, 
					"Escolha a sala\n"+salas, 
					"SALAS DO PRIMEIRO ANDAR", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes1, 
					opcoes1[0]);
		}
		if(andar == 1) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, 
					"Escolha a sala\n"+salas, 
					"SALAS DO SEGUNDO ANDAR", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes2, 
					opcoes2[0]);
		}
		if(andar == 2) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, 
					"Escolha a sala\n"+salas, 
					"SALAS DO TERCEIRO ANDAR", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes3, 
					opcoes3[0]);
		}
		if(andar == 3) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, 
					"Escolha a sala\n"+salas, 
					"SALAS DO QUARTO ANDAR", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes4, 
					opcoes4[0]);
		}
		if(andar == 4) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, 
					"Escolha a sala\n"+salas, 
					"SALAS DO QUINTO ANDAR", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes5, 
					opcoes5[0]);
		}
		if(andar == 5) {
			opcaoEscolhida = JOptionPane.showOptionDialog(null, 
					"Escolha a sala\n"+salas, 
					"SALAS DO SEXTO ANDAR", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes6, 
					opcoes6[0]);
		}
		
		return opcaoEscolhida;
	}
	
	
	//ADICIONA ; NA STRING QUE RE�NE TODAS AS LISTAS
	//CONTA A QUANTIDADE DE LISTAS
	//DETERMINA SE A LISTA ATUAL � A MAIOR AT� O MOMENTO
	public static void salvarLista(String lista) {
		strSalas.append(lista+"; ");
		JOptionPane.showMessageDialog(null, "Listas salvas: "+ strSalas);
		sala = "";
		
		if(tamanho > tamanhoMaior)
			tamanhoMaior = tamanho;
		tamanho = 0;
		qtListas++;
		telaInicial();

	}
	
	
	//PEGA A STRING DE TODAS AS LISTAS E TRANFORMA EM UM VETOR BIDIMENSIONAL, SENDO CADA LINHA UMA LISTA
	//TRANFORMA O VETOR BIDIMENSIONAL EM UM VETOR COM AS SALAS INSERIDAS DE FORMA INTERCALADA E SEM REPETI��O
	//CONTA QUANTIDADE TOTAL DE SALAS
	//TRANSFORMA O VETOR DE SALAS INTERCALADAS EM UMA STRINGBUFFER
	//INSERE A STRINGBUFFER NO M�TODO criarListaCrescente
	//CALCULA O TEMPO TOTAL SEPARA EM MINUTOS E HORAS
	//APRESENTA OS DADOS
	public static void criarListaUnica() {
		
		if(qtListas < 3) 
		{
			JOptionPane.showMessageDialog(null, "Voc� precisa inserir pelo menos tr�s listas para efetuar essa a��o!");
		}
		else 
		{
			
			int tempoSalas[] = criarListaTempo();
			
			int tempoTotal = 0;
			int totalSalas=0;
	
			String Salas = strSalas.toString();
			String vetListas[] = Salas.split("; ");
			
			
			//cria��o do vetor bidimensional de listas
			String vetSalas[][] = new String[qtListas][tamanhoMaior];
			for(int l = 0; l < qtListas; l++) {
				
				String strTemp[] = vetListas[l].split(" ");
				
				for(int i=0; i< strTemp.length; i++) {
					vetSalas[l][i] = strTemp[i];
					totalSalas++;
				}
				
			}
	
			//vetor de lista com salas intercaladas
			int uniaoSalas[] = new int [totalSalas];
			int p=0, sala, j;
			
			for(int f=0; f < tamanhoMaior; f++) {
				for(int g = 0; g < qtListas; g++) {
					if(vetSalas[g][f] != null) {
						sala = Integer.valueOf(vetSalas[g][f]);
						
						j = 0;
						while((j<p) && (sala != uniaoSalas[j]))
							j++;
						
						if(j>= p) {
							uniaoSalas[p++] = sala;
							tempoTotal = tempoTotal + tempoSalas[sala-1];
						
						}
					}
				}
			}
			
			StringBuffer strUniao = new StringBuffer();
			for(int i=0; i < uniaoSalas.length;i++) {
				if(uniaoSalas[i]!= 0)
					strUniao.append(uniaoSalas[i]+ " ");
			}
			

			String Crescente = criarListaCrescente(strUniao.toString());

			int horas, minutos;
			
			horas = tempoTotal/60;
			minutos = tempoTotal % 60;
			
			
			JOptionPane.showMessageDialog(null, "Salas que precisam ser desinfetadas: "+strUniao);
			JOptionPane.showMessageDialog(null, "Salas que precisam ser desinfetadas(em ordem crescente): "+Crescente);
			JOptionPane.showMessageDialog(null, "Demorar� "+horas+" horas: "+minutos+" minutos");
			telaInicial();
		}
	}
	
	//CRIA O VETOR DO TEMPO DE LIMPEZA DE CADA SALA
	public static int[] criarListaTempo() {
		
		int tempoSalas[] = new int[99];

		
		Random r = new Random();
		for(int i = 0; i < tempoSalas.length; i++)
		{
			int tempo = r.nextInt(24)+2;
			boolean primo = verificarPrimo(tempo);
			
			if(primo == true) {
				tempoSalas[i] = tempo;
			}else {
				i--;
			}

		}
		return tempoSalas;
	}
	
	//VERIFICA SE O N�MERO INSERIDO � PRIMO
	public static boolean verificarPrimo(int tempo) {
		
		for (int i = 2; i < tempo; i++) {
            if (tempo % i == 0) 
                return false;
        }
		
		return true;
	}
	
	//ORDENA A STRING DE LISTAS INTERCALADAS DE FORMA CRESCENTE
	public static String criarListaCrescente(String listaUnica) {
		
		String vetListaUnica[] = listaUnica.split(" ");
		
		int n = vetListaUnica.length;
		String aux;
		for (int i = 0; i < n-1; i++)
		    for (int j = 0; j < (n-1)-i; j++)
		        if (Integer.parseInt(vetListaUnica[j]) > Integer.parseInt(vetListaUnica[j+1]))
		        {
					aux = vetListaUnica[j];
					vetListaUnica[j] = vetListaUnica[j+1];
					vetListaUnica[j+1] = aux;
		        }
		
		StringBuffer listaCrescente = new StringBuffer();
		
		for(int i=0; i < vetListaUnica.length;i++) {
				listaCrescente.append(vetListaUnica[i]+ " ");
		}
		
		for(int k = 0; k < vetListaUnica.length; k++)
			System.out.print(" - "+ vetListaUnica[k]);
		
		return listaCrescente.toString();
	}
	


}