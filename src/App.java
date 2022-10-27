import hilos.Hilo1;
import hilos.Hilo2;
import hilos.Hilo3;
import implJoin.ContarConsonantes;
import implJoin.NumeroFibonacci;

public class App {
    public static void main(String[] args) throws Exception {

        /* Implementacion primeros tres puntos */
        Hilo1 hilo1 = new Hilo1();
        hilo1.start();
        hilo1.join();

        Hilo2 hilo2 = new Hilo2(2);
        hilo2.run();
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
    }
}
