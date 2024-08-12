package controller;

public class RestoController
{
 public RestoController()
 {
	super(); 
 }
 
 public int RecResto(int dividendo, int divisor)
 {
	if (dividendo < divisor)
	{
    return dividendo;
	}
	else
	{
	return 	RecResto(dividendo - divisor, divisor);
	}	
 }
}
