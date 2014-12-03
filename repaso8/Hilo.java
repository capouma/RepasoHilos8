/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso8;

/**
 *
 * @author findag
 */
public class Hilo extends Thread
{
    int n;
    public Hilo(int n)
    {
        this.n = n;
    }
    
    @Override
    public void run()
    {
        // Instanciamos 3 variables de tipo int para realizar los calculos
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3 = 0;
        
        for(int i=0;i<n;i++)
        {
        fibo3 = fibo1 + fibo2;
        fibo1 = fibo2;
        fibo2 = fibo3;
        
        System.out.print(" "+ fibo1); 
        }
    }
}
