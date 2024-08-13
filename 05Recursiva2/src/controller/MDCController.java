package controller;

public class MDCController 
{
 public MDCController()
 {
	super();
 }
 
 public int RecMDC(int x, int y)
 {
 if (x == y)
  {
	return x;
  } 
  else
  {
	if (x > y)
	{	
	return RecMDC( x - y, y);
	}
	return RecMDC( x, y - x);
  }  
 }
}
