package co.edu.usbcali.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public double suma(double a, double b) {
    	return a+b;
    }
    public double resta(double a, double b) {
    	return a-b;
    }
    public double multiplicacion(double a, double b) {
    	return a*b;
    }
    public double division(double a, double b) throws Exception{
    	if(b==0) {
    		throw new Exception("no se puede dividir un número entre cero 0");
    	}
    	return a/b;
    }
    
}
