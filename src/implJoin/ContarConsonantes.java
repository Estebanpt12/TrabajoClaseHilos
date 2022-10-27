package implJoin;

public class ContarConsonantes extends Thread{

    private int conteo;
    private String palabra;

    public ContarConsonantes(String p){
        palabra = p;
        conteo = 0;
    }

    @Override
    public void run(){
        for(int i = 0; i<palabra.length(); i++){
            if(validarPalabra(palabra, i)){
                conteo += 1;
            }
        }
    }


    public int getConteo() {
        return this.conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    private boolean validarPalabra(String palabra, int index){
        return palabra.charAt(index) != 'a' && palabra.charAt(index) != 'e' && palabra.charAt(index) != 'i' &&
        palabra.charAt(index) != 'o' && palabra.charAt(index) != 'u' && palabra.charAt(index) != 'A' && 
        palabra.charAt(index) != 'E' && palabra.charAt(index) != 'I' && palabra.charAt(index) != 'O' && 
        palabra.charAt(index) != 'U';
    }
    
}
