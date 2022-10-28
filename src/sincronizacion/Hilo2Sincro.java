package sincronizacion;

public class Hilo2Sincro extends Thread {
    private String var;

    public Hilo2Sincro(){
    }

    public String getVar(){
        return var;
    }

    public void setVar(String var){
        this.var = var;
    }

    @Override
    public void run() {
        System.out.println(var);
        var = "";
    }
}
