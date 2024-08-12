package controller;

public class FatorialDuploController 
{
 public FatorialDuploController()
 {
	super(); 
 }
 
 public int RecFatorialDuplo(int numero)
 {
 if (numero == 1)
  {
	return numero; 
  }
  else
  {
   if (numero % 2 != 0)
   {
	return numero * RecFatorialDuplo(numero - 1); 
   }
   return RecFatorialDuplo(numero - 1); 
  }  
 }
}
