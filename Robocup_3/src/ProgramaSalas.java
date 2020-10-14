import java.util.Random;

public class ProgramaSalas 
{
	public static final int MINIM = 5;
	public static final int LISTA = 8;
	public static final int SALAS = 98;
	public static final int TEMPO = 13;
	
	public static void main(String[] args) 
	{
		int lista1, lista2, lista3;
		int i, j, u;
		int menorLista, maiorLista;
		int totalSalas;
		int vMinutos[] = new int[99];
		int MINUTOS;
		Random r = new Random();
		
		//gera os vetores de maneira aleatória
		//(listas de salas, listas de entrada)
		lista1 = r.nextInt(LISTA)+MINIM;
		lista2 = r.nextInt(LISTA)+MINIM;
		lista3 = r.nextInt(LISTA)+MINIM;
		
		int vLista1[] = new int[lista1];
		int vLista2[] = new int[lista2];
		int vLista3[] = new int[lista3];
		
		//obtém o tamanho das listas
		totalSalas = lista1 + lista2 + lista3;
		menorLista = Math.min(lista1,  Math.min(lista2, lista3));
		maiorLista = Math.max(lista1,  Math.max(lista2, lista3));
		
		//preenche os vetores com salas aleatórias
		for(i=0; i< vLista1.length; i++)
			vLista1[i] = r.nextInt(SALAS)+1;
		
		for(i=0; i< vLista2.length; i++)
			vLista2[i] = r.nextInt(SALAS)+1;
		
		for(i=0; i< vLista3.length; i++)
			vLista3[i] = r.nextInt(SALAS)+1;
		
		//preenche o vetor "minutos"
		for(i=0; i< vMinutos.length; i++)
			vMinutos[i] = r.nextInt(TEMPO)+3;
		
		//gera o vetor lista intercalada
		int vListaI[] = new int[totalSalas];
		
		j=0;
		for(i=0; i< menorLista; i++)
		{
			vListaI[j++] = vLista1[i];
			vListaI[j++] = vLista2[i];
			vListaI[j++] = vLista3[i];
		}
		
		for(i = menorLista; i < maiorLista; i++)
		{
			if(lista1 > i)
				vListaI[j++] = vLista1[i];
			if(lista2 > i)
				vListaI[j++] = vLista2[i];
			if(lista3 > i)
				vListaI[j++] = vLista3[i];
		}
		//gera o vetor lista única
		int vListaU[] = new int[totalSalas];
		
		u = 0;
		for(i=0; i < vListaI.length; i++)
		{
			j=0;
			while((j<u) && (vListaI[i] != vListaU[j]))
				j++;
			
			if(j >= u)
				vListaU[u++] = vListaI[i];
		}
		
		//calcula os minutos necessários
		//para desinfetar todas as salas
		MINUTOS = 0;
		for(i =0 ; i < u; i++)
			MINUTOS = MINUTOS + vMinutos[vListaU[i]-1];
		
		printLista(vLista1, '1');
		printLista(vLista2, '2');
		printLista(vLista3, '3');
		printLista(vListaU, 'U');
		printLista(vListaI, 'I');
		
		System.out.print("\nMINUTOS=" +MINUTOS);
		System.out.print("\ntempo desinfecções= ");
		System.out.print(MINUTOS/60+"h:" +MINUTOS%60 + "min");
		System.out.println();
	}
	
	public static void printLista(int lista[], char listaID)
	{
		int i;
		
		System.out.print("Lista "+listaID + ": ");
		for(i = 0; i< lista.length; i++)
			System.out.printf("%02d%s", lista[i], ", ");
		System.out.print("\n\n");
	}

}
