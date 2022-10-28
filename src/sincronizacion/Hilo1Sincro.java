package sincronizacion;

public class Hilo1Sincro extends Thread{

    private String var;

    public String getVar() {
        return this.var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public Hilo1Sincro(String var) {
        this.var = var;
    }

    public void run() {
        long ti = System.currentTimeMillis();
        long tf;
        String varI = var;
        do {
            var += varI + " ";
            tf = System.currentTimeMillis();
        } while(tf - ti < 6000);

    }
}
