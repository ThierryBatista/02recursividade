package view;
import controller.FatorialDuploController;

public class FatorialDuplo
{
	public static void main(String[] args) 
	{
		FatorialDuploController FatD = new FatorialDuploController();
		int numero = 7;
		
		int fatd = FatD.RecFatorialDuplo(numero);
		System.out.println(fatd);

	}
}
