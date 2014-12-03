/*
 * Crea un hilo que realice el cálculo de los primeros N números de la sucesión de Fibonacci.
 * El parámetro N será indicado cuando se llame al constructor de la clase Thread correspondiente.
 */
package repaso8;

/**
 *
 * @author findag
 */
public class Repaso8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Creamos una variable con un valor aleatorio.
        int n = (int) (Math.random() * (20 - 1) + 1);
        
        // Definimos e instanciamos el hilo y pasamos como parametro n.
        Hilo hilo = new Hilo(n);
        
        // Lanzamos el hilo
        hilo.start();
    }
    
}
