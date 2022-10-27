import hilos.Hilo2;
import implJoin.ContarConsonantes;
import implJoin.NumeroFibonacci;

public class App {
    public static void main(String[] args) throws Exception {
        /*Hilo2 hilo2 = new Hilo2(2);
        hilo2.run();*/
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
