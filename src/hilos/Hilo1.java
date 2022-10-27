package hilos;

public class Hilo1 extends Thread{


    int[] arreglo = {1,2,3,4,5,6,7,8,9,10};



    @Override
    public void run(){
        for (int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
