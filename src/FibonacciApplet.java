

import java.applet.Applet;
import java.awt.*;

public class FibonacciApplet extends Applet {

   Label nLb, reLb;
   TextField num, result;

   public void init()

	{
	nLb = new Label("Ingresen el valor el cual quieren calcular ");
	num = new TextField(10);
	reLb = new Label("El valor de Fibonacci");
	result = new TextField(15);
	result.setEditable(false);

	add(nLb);
	add( num);
	add (reLb);
	add (result);
 	}

   public boolean action(Event e, Object o)

    {
	long number, fibonacciVal;
	
	number = Long.parseLong( num.getText());
	showStatus("Calculando.....");
	fibonacciVal = fibonacci (number);
	showStatus ("Acabo de calcular");
	result.setText (Long.toString( fibonacciVal ));
	return true;
      }
  long fibonacci (long n)

  {
	if ( n == 0 || n == 1)
		return n;
	else
		return (fibonacci(n-1) + fibonacci(n-2));
  }
}