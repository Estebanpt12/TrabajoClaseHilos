package hilos;

public class Hilo2 extends Thread{

    private long numero;
    private long result;

    public Hilo2 (long num){
        numero = num;
        result = 1;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            result *= numero;
            System.out.println(result);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    
}
