
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public void Test()
    {
        x = 0;
    }

    /**
     * 
     */
    public void testSumValuesInterval() 
    {
        Calculadora calculad1 = new Calculadora();
        Calculadora calculad2 = new Calculadora();
        Calculadora calculad3 = new Calculadora();
        
        System.out.println("Comprobando sumValuesInterval(2,4)... " + calculad1.sumValuesInterval(2,4) + " = 14");
        System.out.println("Comprobando sumValuesInterval(8,5)... " + calculad2.sumValuesInterval(8,5) + " = 35");
        System.out.println("Comprobando sumValuesInterval(10,10)... " + calculad2.sumValuesInterval(10,10) + " = 10");
        System.out.println("El metodo funciona correctamente");
    } 
    
    public void testIsPrime() {
        
    }
}
