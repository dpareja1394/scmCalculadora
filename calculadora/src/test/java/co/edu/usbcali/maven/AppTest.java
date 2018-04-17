package co.edu.usbcali.maven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	App app;
	double a = 2;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void suma()
    {
        app = new App();
        double suma = app.suma(a, 3);
        System.out.println("El resultado de la suma es "+suma);
    }
    
    @Test
    public void resta()
    {
        app = new App();
        double resta = app.resta(a, 3);
        System.out.println("El resultado de la resta es "+resta);
    }
    
    @Test
    public void multiplicacion()
    {
        app = new App();
        double multiplicacion = app.multiplicacion(a, 3);
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
    }
    
    @Test
    public void division()
    {
    	try {
    		app = new App();
            double division = app.division(a, 0);
            System.out.println("El resultado de la division es "+division);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
    }
}
