
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Metodo que permite mostrar por pantalla los multiplos de 5 del 10 al 95
     */
    public void multiplesOffive()
    {
        int multiplo = 5;
        int x = 3;
        int resultado = 0;
        while (resultado >= 0 && resultado < 90) {
            resultado = multiplo * x;
            System.out.println(resultado);
            x++;
        }
    }
    
    /**
     * Metodo que suma los numeros del 1 al 10
     */
    public void sumValues() {
        int resultado = 1;
        int sumador = 1;
        while (sumador <= 10)  {
            resultado = resultado + sumador;
            System.out.println(resultado);
            sumador++;
        }
    }
}
