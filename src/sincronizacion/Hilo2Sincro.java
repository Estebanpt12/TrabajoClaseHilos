package sincronizacion;

public class Hilo2Sincro extends Thread {
    private String var;

    public Hilo2Sincro(String var){
        this.var = var;
    }

    public String getVar(){
        return var;
    }

    public void setVar(String var){
        this.var = var;
    }

    @Override
    public void run() {
        mostrarVariable(var);
    }

    public String mostrarVariable(String var){
        System.out.println(var);
        var = "";
        return var;
    }
}
