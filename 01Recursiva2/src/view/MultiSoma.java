package view;

import controller.MultiSomaController;

public class MultiSoma 
{

	public static void main(String[] args)
	{
	MultiSomaController Mult = new MultiSomaController();
	
	int a = 2;
	int b = 3;
	
	int multi = Mult.RecMultiSoma(a, b);
	
	System.out.println(multi);

	}

}
