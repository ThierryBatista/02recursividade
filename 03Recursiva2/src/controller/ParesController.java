package controller;

public class ParesController 
{
 public ParesController()
 {
	super();
 }
  
 public int RecPares(int[]vet, int tamanho, int cta)
 {
	if (tamanho == 0)
	{	
	return cta;
	}
 
 else 
 {
	if (vet[tamanho - 1] % 2 == 0)	
	{
	return RecPares(vet, tamanho - 1, cta + 1);
	}
	return RecPares(vet, tamanho - 1, cta);
 } 
 
 }
}
