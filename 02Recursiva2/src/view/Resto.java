package view;
import controller.RestoController;

public class Resto 
{

	public static void main(String[] args) 
	{
		RestoController	Resto = new RestoController();
		
		int dividendo = 67;
		int divisor = 10;
		
		int remain = Resto.RecResto(dividendo, divisor);
		System.out.println(remain);

	}

}
