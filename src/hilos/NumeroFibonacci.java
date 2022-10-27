package hilos;

public class NumeroFibonacci extends Thread{

    private int number;

    public NumeroFibonacci (int number){
        this.number = number;
    }

    @Override
    public void run(){
        int num1 = 0, num2 = 1, suma = 1;         
        for (int i = 1; i < number; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
