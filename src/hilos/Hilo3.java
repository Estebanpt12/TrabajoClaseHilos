package hilos;

public class Hilo3 extends Thread{

    String nombre;

    public Hilo3(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(nombre);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
