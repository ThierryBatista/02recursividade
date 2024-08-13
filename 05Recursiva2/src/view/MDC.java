package view;
import controller.MDCController;
public class MDC 
{
	public static void main(String[] args) 
	{
	 MDCController MDC = new MDCController();
	 int x = 48;
	 int y = 18;
	 int mdc = MDC.RecMDC(x, y);
	 System.out.println(mdc);

	}
}
