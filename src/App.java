import hilos.Hilo2;
import hilos.NumeroFibonacci;

public class App {
    public static void main(String[] args) throws Exception {
        /*Hilo2 hilo2 = new Hilo2(2);
        hilo2.run();*/
        NumeroFibonacci n = new NumeroFibonacci(10);
        n.start();
    }
}
