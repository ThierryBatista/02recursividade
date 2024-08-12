package view;
import controller.ParesController;

public class Pares 
{

	public static void main(String[] args) 
	{
	ParesController Par = new ParesController();
	int vet[] = {1, 2, 3, 4, 5, 6};
	int tamanho = vet.length;
	int cta = 0;
	
	int pares = Par.RecPares(vet, tamanho, cta);
	System.out.println(pares);

	}

}
