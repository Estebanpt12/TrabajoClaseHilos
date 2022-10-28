import java.util.Scanner;

import hilos.Hilo1;
import hilos.Hilo2;
import hilos.Hilo3;
import implJoin.ContarConsonantes;
import implJoin.NumeroFibonacci;
import sincronizacion.Hilo1Sincro;
import sincronizacion.Hilo2Sincro;

public class App {
    public static void main(String[] args) throws Exception {

        /* Implementacion primeros tres puntos */
        Hilo1 hilo1 = new Hilo1();
        hilo1.start();
        hilo1.join();


        Hilo2 hilo2 = new Hilo2(2);
        hilo2.start();
        hilo2.join();

        Hilo3 hilo3 = new Hilo3("Hilo 3!");
        hilo3.start();
        hilo3.join();

        /* Implementacion segundo punto (Join) */
        NumeroFibonacci n = new NumeroFibonacci(10);
        n.start();
        ContarConsonantes contarConsonantes = new ContarConsonantes("Hola");
        contarConsonantes.start();
        n.join();
        contarConsonantes.join();
        int resultado = n.getNumber() * contarConsonantes.getConteo();
        System.out.println(resultado);

        /*Implementación sincronizacion de hilos */
        String var;
        System.out.println ("Por favor introduzca una cadena:");
        try (Scanner entradaEscaner = new Scanner (System.in)) {
            var = entradaEscaner.nextLine ();
        }
        long ti = System.currentTimeMillis();
        long tf;
        do {
            Hilo1Sincro hilo1Sincro = new Hilo1Sincro(var);
            Hilo2Sincro hilo2Sincro = new Hilo2Sincro();
            hilo1Sincro.start();
            hilo1Sincro.join();
            hilo2Sincro.setVar(hilo1Sincro.getVar());
            hilo2Sincro.start();
            hilo2Sincro.join();
            hilo1Sincro.setVar(hilo2Sincro.getVar());
            System.out.println(hilo1Sincro.getVar());
            tf = System.currentTimeMillis();
        } while (tf - ti < 30000);
        
    } 

}
