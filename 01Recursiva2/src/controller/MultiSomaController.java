package controller;

public class MultiSomaController 
{
public MultiSomaController() 
{
super();
}
 
 public int RecMultiSoma(int a, int b)
 {
 if (b == 1)
  {
	return a;
  } 
   else
   { 
	   return a + RecMultiSoma( a,  b - 1);
   }
   
 }
}
